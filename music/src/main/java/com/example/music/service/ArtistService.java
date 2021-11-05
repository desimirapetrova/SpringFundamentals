package com.example.music.service;

import com.example.music.model.entity.Artist;
import com.example.music.model.entity.ArtistNameEnum;

import java.util.Optional;

public interface ArtistService {
    public void initArtists();

    Artist findByArtistNameEnum(ArtistNameEnum artist);
}
