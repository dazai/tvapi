package com.example.tvapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Det {

    @SerializedName("backdrop_path")
    private String backdropPath;
    @SerializedName("created_by")
    private List<Producer> createdBy;
    @SerializedName("episode_run_time")
    private List<Integer> episodeRunTime;
    @SerializedName("first_air_date")
    private String firstAirDate;
    private List<Genre> genres;
    @SerializedName("home_page")
    private String homePage;
    private Integer id;
    @SerializedName("in_production")
    private boolean inProduction;
    private List<String> languages;
    @SerializedName("last_air_date")
    private String lastAirDate;
    @SerializedName("last_episode_to_air")
    private LastEpisode lastEpisodeToAir;
    private String name;
    @SerializedName("next_episode_to air")
    private String nextEpisodeToAir;
    private List<Network> networks;
    @SerializedName("number_of_episodes")
    private Integer numberOfEpisodes;
    @SerializedName("number_of_seasons")
    private Integer numberOfSeasons;
    @SerializedName("origin_country")
    private List<String> originCountry;
    @SerializedName("original_language")
    private String originalLanguage;
    @SerializedName("original_name")
    private String originalName;
    private String overview;
    private Float popularity;
    @SerializedName("poster_path")
    private String posterPth;
    @SerializedName("production_companies")
    private List<Company> productionCompanies;
    private List<Season> seasons;
    private String status;
    private String type;
    @SerializedName("vote_average")
    private Float voteAverage;
    @SerializedName("vote_count")
    private Integer voteCount;

    public Det(String backdropPath, List<Producer> createdBy, List<Integer> episodeRunTime, String firstAirDate, List<Genre> genres, String homePage, Integer id, boolean inProduction, List<String> languages, String lastAirDate, LastEpisode lastEpisodeToAir, String name, String nextEpisodeToAir, List<Network> networks, Integer numberOfEpisodes, Integer numberOfSeasons, List<String> originCountry, String originalLanguage, String originalName, String overview, Float popularity, String posterPth, List<Company> productionCompanies, List<Season> seasons, String status, String type, Float voteAverage, Integer voteCount) {
        this.backdropPath = backdropPath;
        this.createdBy = createdBy;
        this.episodeRunTime = episodeRunTime;
        this.firstAirDate = firstAirDate;
        this.genres = genres;
        this.homePage = homePage;
        this.id = id;
        this.inProduction = inProduction;
        this.languages = languages;
        this.lastAirDate = lastAirDate;
        this.lastEpisodeToAir = lastEpisodeToAir;
        this.name = name;
        this.nextEpisodeToAir = nextEpisodeToAir;
        this.networks = networks;
        this.numberOfEpisodes = numberOfEpisodes;
        this.numberOfSeasons = numberOfSeasons;
        this.originCountry = originCountry;
        this.originalLanguage = originalLanguage;
        this.originalName = originalName;
        this.overview = overview;
        this.popularity = popularity;
        this.posterPth = posterPth;
        this.productionCompanies = productionCompanies;
        this.seasons = seasons;
        this.status = status;
        this.type = type;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public List<Producer> getCreatedBy() {
        return createdBy;
    }

    public List<Integer> getEpisodeRunTime() {
        return episodeRunTime;
    }

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public String getHomePage() {
        return homePage;
    }

    public Integer getId() {
        return id;
    }

    public boolean isInProduction() {
        return inProduction;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public String getLastAirDate() {
        return lastAirDate;
    }

    public LastEpisode getLastEpisodeToAir() {
        return lastEpisodeToAir;
    }

    public String getName() {
        return name;
    }

    public String getNextEpisodeToAir() {
        return nextEpisodeToAir;
    }

    public List<Network> getNetworks() {
        return networks;
    }

    public Integer getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public Integer getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public List<String> getOriginCountry() {
        return originCountry;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalName() {
        return originalName;
    }

    public String getOverview() {
        return overview;
    }

    public Float getPopularity() {
        return popularity;
    }

    public String getPosterPth() {
        return posterPth;
    }

    public List<Company> getProductionCompanies() {
        return productionCompanies;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public Float getVoteAverage() {
        return voteAverage;
    }

    public Integer getVoteCount() {
        return voteCount;
    }
}
