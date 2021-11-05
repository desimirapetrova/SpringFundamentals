package com.example.music.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "artists")
public class Artist extends BaseEntity{
    @Column(columnDefinition = "TEXT")
    private String career_information;
    @Enumerated(EnumType.STRING)
    private  ArtistNameEnum name;

    public Artist() {
    }

    public String getCareer_information() {
        return career_information;
    }

    public void setCareer_information(String career_information) {
        this.career_information = career_information;
    }

    public ArtistNameEnum getName() {
        return name;
    }

    public void setName(ArtistNameEnum name) {
        this.name = name;
    }
}
