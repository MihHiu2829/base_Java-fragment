package com.example.movieapp.API.Res;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
import java.util.ServiceConfigurationError;

public class MovieRes implements Serializable
{       @SerializedName("page")
        public int page ;
        @SerializedName("total_pages")
        public int totalPages ;

        @SerializedName("results")
        public List<Result> results ;
        @SerializedName("total_results")
        public int totalResults ;

        public static class Result
        {
                @SerializedName("adult")
                public boolean adult ;
                @SerializedName("backdrop_path")
                public String backdropPath ;
                @SerializedName("id")
                public String id ;
                @SerializedName("original_title")
                public String originalTitle ;
                @SerializedName("overview")
                public String overview ;
                @SerializedName("poster_path")
                public String posterPath ;
                @SerializedName("release_date")
                public String releaseDate ;
        }

}
