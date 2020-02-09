package com.example.tvapi;

import com.google.gson.annotations.SerializedName;

public class Season {

    @SerializedName("air_date")
    private String airDate;
    @SerializedName("epispde_count")
    private Integer episodeCount;
    private Integer id;
    private String name;
    private String overview;
    @SerializedName("poster_path")
    private String posterPath;
    @SerializedName("season_number")
    private Integer seasonNumber;

    public Season(String airDate, Integer episodeCount, Integer id, String name, String overview, String posterPath, Integer seasonNumber) {
        this.airDate = airDate;
        this.episodeCount = episodeCount;
        this.id = id;
        this.name = name;
        this.overview = overview;
        this.posterPath = posterPath;
        this.seasonNumber = seasonNumber;
    }

    public String getAirDate() {
        return airDate;
    }

    public Integer getEpisodeCount() {
        return episodeCount;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public Integer getSeasonNumber() {
        return seasonNumber;
    }
}
