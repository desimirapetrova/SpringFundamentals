package com.example.music.service;

import com.example.music.model.service.AlbumServiceModel;
import com.example.music.model.view.AlbumViewModel;

import java.util.List;

public interface AlbumService {
    public void addOrder(AlbumServiceModel albumServiceModel);

    List<AlbumViewModel> findALlCopies();

    List<AlbumViewModel> findAll();

    void deleteAlbum(Long id);
}
