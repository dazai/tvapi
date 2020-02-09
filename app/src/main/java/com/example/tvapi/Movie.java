package com.example.tvapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Movie {

    @SerializedName("original_name")
    private String originalName;
    @SerializedName("genre_ids")
    private List<Integer> genreIds;
    private String name;
    private Float popularity;
    @SerializedName("origin_country")
    private List<String> originCountry;
    @SerializedName("vote_count")
    private Integer voteCount;
    @SerializedName("first_air_date")
    private String firstAirDate;
    @SerializedName("backdrop_path")
    private String backdropPath;
    @SerializedName("original_language")
    private String originalLanguage;
    private Integer id;
    @SerializedName("vote_average")
    private Float voteAverage;
    private String overview;
    @SerializedName("poster_path")
    private String posterPath;

    public Movie(String originalName, List<Integer> genreIds, String name, Float popularity, List<String> originCountry, Integer voteCount, String firstAirDate, String backdropPath, String originalLanguage, Integer id, Float voteAverage, String overview, String posterPath) {
        this.originalName = originalName;
        this.genreIds = genreIds;
        this.name = name;
        this.popularity = popularity;
        this.originCountry = originCountry;
        this.voteCount = voteCount;
        this.firstAirDate = firstAirDate;
        this.backdropPath = backdropPath;
        this.originalLanguage = originalLanguage;
        this.id = id;
        this.voteAverage = voteAverage;
        this.overview = overview;
        this.posterPath = posterPath;
    }

    public String getOriginalName() {
        return originalName;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public String getName() {
        return name;
    }

    public Float getPopularity() {
        return popularity;
    }

    public List<String> getOriginCountry() {
        return originCountry;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public Integer getId() {
        return id;
    }

    public Float getVoteAverage() {
        return voteAverage;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }
}
