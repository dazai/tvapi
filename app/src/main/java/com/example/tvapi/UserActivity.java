package com.example.tvapi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserActivity extends AppCompatActivity {
    Button btnLogOut;
    TextView welcome;
    ListView movies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btnLogOut = findViewById(R.id.btnLogOut);
        welcome = findViewById(R.id.welcome);
        movies = findViewById(R.id.movies);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ResApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ResApi api = retrofit.create(ResApi.class);
        Call<Resultat> call = api.getMovies();
        call.enqueue(new Callback<Resultat>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(Call<Resultat> call, Response<Resultat> response) {
                final Resultat resultat = response.body();
                welcome.setText("Welcome, displaying "+resultat.getPage()+" of "+resultat.getTotalPages()+" page."
                        +"\n Showing "+resultat.getResults().size()+" of "+resultat.getTotalResultats()+" result.");
                final String[] names = new String[resultat.getResults().size()];
                for(int i = 0; i < resultat.getResults().size(); i++){
                    names[i] = resultat.getResults().get(i).getName();
                }

                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_list_item_1,
                        names
                ){
                  @Override
                  public View getView(int position, View convertView, ViewGroup parent){
                      View view = super.getView(position, convertView, parent);
                      TextView textView = view.findViewById(android.R.id.text1);
                      textView.setTextColor(Color.BLACK);
                      return view;
                  }
                };
                movies.setAdapter(arrayAdapter);

                movies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(getApplicationContext(), names[position], Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), Detail.class);
                        intent.putExtra("id", resultat.getResults().get(position).getId());
                        intent.putExtra("poster_path", resultat.getResults().get(position).getPosterPath());
                        startActivity(intent);
                    }
                });
            }

            @Override
            public void onFailure(Call<Resultat> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), SignIn.class);
                startActivity(intent);

            }
        });

    }
}

