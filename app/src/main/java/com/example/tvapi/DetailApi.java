package com.example.tvapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DetailApi {

    String BASE_URL = "https://api.themoviedb.org/3/tv/";

    @GET("{id}?api_key=77ff8a9a0454c4fa891dc0dc0a2ba355&language=en-US/")
    Call<Det> getDetails(@Path("id") String id);

}
