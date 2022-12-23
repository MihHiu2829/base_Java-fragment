package com.example.movieapp.API;

import com.example.movieapp.API.Req.createSission;
import com.example.movieapp.API.Res.getAuthen;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface  API {
   String API_key = "adee871a78e5736c792ff131a3a29566" ;
    @GET("authentication/token/new?api_key=" + API_key)
    @Headers("Content-Type: application/json")
    Call<getAuthen> getAuthen() ;

        @POST("authentication/token/validate_with_login?api_key=" + API_key)
        @Headers("Content-Type: application/json")
        Call<getAuthen> createSission(@Body  createSission acc) ;



}
