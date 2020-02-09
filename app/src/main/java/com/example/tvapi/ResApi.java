package com.example.tvapi;


import retrofit2.Call;
import retrofit2.http.GET;

public interface ResApi {

    String BASE_URL = "https://api.themoviedb.org/3/tv/";


    @GET("popular?api_key=77ff8a9a0454c4fa891dc0dc0a2ba355&language=en-US&page=1")
    Call<Resultat> getMovies();


}
