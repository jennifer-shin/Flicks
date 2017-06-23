package com.example.jennifershin.flicks.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

/**
 * Created by jennifershin on 6/21/17.
 */

@Parcel // annotation indicates class is Parcelable
public class Movie {

    String title;
    String overview;
    String posterPath;
    String backdropPath;
    Double voteAverage;

    public Movie () {}

    public Movie (JSONObject movie) throws JSONException{
        title = movie.getString("title");
        overview = movie.getString("overview");
        posterPath = movie.getString("poster_path");
        backdropPath = movie.getString("backdrop_path");
        voteAverage = movie.getDouble("vote_average");
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }
}
