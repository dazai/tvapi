package com.example.tvapi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class Detail extends AppCompatActivity {

    TextView showName;
    ImageView poster;

    @SuppressLint("LongLogTag")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        poster = findViewById(R.id.poster);
        showName = findViewById(R.id.show_name);
        Bundle bundle = this.getIntent().getExtras();
        final Integer id = bundle.getInt("id");
        final String posterPath = bundle.getString("poster_path");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DetailApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        DetailApi api = retrofit.create(DetailApi.class);
        Call<Det> call = api.getDetails(Integer.toString(id));
        try {
            Response<Det> response = call.execute();
            Det details = response.body();
            showName.append("Show name : "+details.getName()+"\n");
            showName.append("Genres : ");
            for(Genre g : details.getGenres()){
                showName.append(g.getName()+" ");
            }
            showName.append("\n");
            showName.append("N° of seasons : "+details.getNumberOfSeasons()+"\n");
            showName.append("N° of episodes : "+details.getNumberOfEpisodes()+"\n");
            showName.append("Producers : ");
            for(Producer producer : details.getCreatedBy()){
                showName.append(producer.getName()+" ");
            }

        } catch (IOException e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        }

        final String path = "https://image.tmdb.org/t/p/w500/"+posterPath;
        Glide.with(getApplicationContext()).load(path).into(poster);


    }
}
