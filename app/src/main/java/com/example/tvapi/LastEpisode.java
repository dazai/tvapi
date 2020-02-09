package com.example.tvapi;

import com.google.gson.annotations.SerializedName;

public class LastEpisode {

    @SerializedName("air_date")
    private String airDate;
    @SerializedName("episode_number")
    private Integer episodeNumber;
    private Integer id;
    private String name;
    private String overview;
    @SerializedName("production_code")
    private String  productionCode;
    @SerializedName("season_number")
    private Integer seasonNumber;
    @SerializedName("show_id")
    private Integer showId;
    @SerializedName("still_path")
    private String stillPath;
    @SerializedName("vote_average")
    private Float voteAverage;
    @SerializedName("vote_count")
    private Integer voteCount;

    public LastEpisode(String airDate, Integer episodeNumber, Integer id, String name, String overview, String productionCode, Integer seasonNumber, Integer showId, String stillPath, Float voteAverage, Integer voteCount) {
        this.airDate = airDate;
        this.episodeNumber = episodeNumber;
        this.id = id;
        this.name = name;
        this.overview = overview;
        this.productionCode = productionCode;
        this.seasonNumber = seasonNumber;
        this.showId = showId;
        this.stillPath = stillPath;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
    }

    public String getAirDate() {
        return airDate;
    }

    public Integer getEpisodeNumber() {
        return episodeNumber;
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

    public String getProductionCode() {
        return productionCode;
    }

    public Integer getSeasonNumber() {
        return seasonNumber;
    }

    public Integer getShowId() {
        return showId;
    }

    public String getStillPath() {
        return stillPath;
    }

    public Float getVoteAverage() {
        return voteAverage;
    }

    public Integer getVoteCount() {
        return voteCount;
    }
}
