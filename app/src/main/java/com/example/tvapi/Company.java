package com.example.tvapi;

import com.google.gson.annotations.SerializedName;

public class Company {

    private Integer id;
    @SerializedName("logo_path")
    private String logoPath;
    private String name;
    @SerializedName("origin_country")
    private String originCountry;

    public Company(Integer id, String logoPath, String name, String originCountry) {
        this.id = id;
        this.logoPath = logoPath;
        this.name = name;
        this.originCountry = originCountry;
    }

    public Integer getId() {
        return id;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public String getName() {
        return name;
    }

    public String getOriginCountry() {
        return originCountry;
    }
}
