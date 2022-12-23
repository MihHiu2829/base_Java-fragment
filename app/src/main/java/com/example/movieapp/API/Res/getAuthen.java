package com.example.movieapp.API.Res;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class getAuthen implements Serializable {
        @SerializedName("success")
        public boolean success ;
        @SerializedName("expires_at")
        public String expiresAt ;
        @SerializedName("request_token")
        public String requestToken ;

    @Override
    public String toString() {
        return "getAuthen{" +
                "success=" + success +
                ", expiresAt='" + expiresAt + '\'' +
                ", requestToken=" + requestToken +
                '}';
    }
}
