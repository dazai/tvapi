package com.example.tvapi;

import com.google.gson.annotations.SerializedName;

public class Producer {

    private Integer id;
    @SerializedName("credit_id")
    private String creditId;
    private String name;
    private Integer gender;
    @SerializedName("profile_path")
    private String profilePath;

    public Producer(Integer id, String creditId, String name, Integer gender, String profilePath) {
        this.id = id;
        this.creditId = creditId;
        this.name = name;
        this.gender = gender;
        this.profilePath = profilePath;
    }

    public Integer getId() {
        return id;
    }

    public String getCreditId() {
        return creditId;
    }

    public String getName() {
        return name;
    }

    public Integer getGender() {
        return gender;
    }

    public String getProfilePath() {
        return profilePath;
    }
}
