package com.example.tvapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Resultat {

    private Integer page;
    @SerializedName("total_results")
    private Integer totalResultats;
    @SerializedName("total_pages")
    private Integer totalPages;
    private List<Movie> results;

    public Resultat(Integer page, Integer totalResultats, Integer totalPages, List<Movie> results) {
        this.page = page;
        this.totalResultats = totalResultats;
        this.totalPages = totalPages;
        this.results = results;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getTotalResultats() {
        return totalResultats;
    }


    public Integer getTotalPages() {
        return totalPages;
    }

    public List<Movie> getResults() {
        return results;
    }

}
