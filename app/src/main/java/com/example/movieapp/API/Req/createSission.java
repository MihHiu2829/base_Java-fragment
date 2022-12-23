package com.example.movieapp.API.Req;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class createSission implements Serializable {
    @SerializedName("username")
    public String username ;
    @SerializedName("password")
    public String password ;
    @SerializedName("request_token")
    public String request_token ;

    public createSission(String username, String password, String request_token) {
        this.username = username;
        this.password = password;
        this.request_token = request_token;
    }
}
