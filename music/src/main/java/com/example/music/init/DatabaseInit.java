package com.example.music.init;

import com.example.music.service.ArtistService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInit implements CommandLineRunner {
    private final ArtistService artistService;

    public DatabaseInit(ArtistService artistService) {
        this.artistService = artistService;
    }


    @Override
    public void run(String... args) throws Exception {
        artistService.initArtists();
    }
}
