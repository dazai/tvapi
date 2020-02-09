package com.example.tvapi;

import com.google.gson.annotations.SerializedName;

public class Network {

    private String name;
    private Integer id;
    @SerializedName("logo_path")
    private String logoPath;
    @SerializedName("origin_country")
    private String originCountry;

    public Network(String name, Integer id, String logoPath, String originCountry) {
        this.name = name;
        this.id = id;
        this.logoPath = logoPath;
        this.originCountry = originCountry;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public String getOriginCountry() {
        return originCountry;
    }
}
