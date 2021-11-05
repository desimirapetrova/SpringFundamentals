package com.example.music.service.impl;

import com.example.music.model.entity.Album;
import com.example.music.model.service.AlbumServiceModel;
import com.example.music.model.view.AlbumViewModel;
import com.example.music.repository.AlbumRepository;
import com.example.music.service.AlbumService;
import com.example.music.service.ArtistService;
import com.example.music.service.UserService;
import com.example.music.util.CurrentUser;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlbumServiceImpl implements AlbumService {
    private final ModelMapper modelMapper;
    private final UserService userService;
    private final CurrentUser currentUser;
    private final ArtistService artistService;
    private final AlbumRepository albumRepository;

    public AlbumServiceImpl(ModelMapper modelMapper, UserService userService, CurrentUser currentUser, ArtistService artistService, AlbumRepository albumRepository) {
        this.modelMapper = modelMapper;
        this.userService = userService;
        this.currentUser = currentUser;
        this.artistService = artistService;
        this.albumRepository = albumRepository;
    }

    @Override
    public void addOrder(AlbumServiceModel albumServiceModel) {
        Album album = modelMapper.map(albumServiceModel, Album.class);
        album.setAdded_from(userService.findById(currentUser.getId()));
        album.setArtist(artistService.findByArtistNameEnum(albumServiceModel.getArtist().getName()));

        albumRepository.save(album);
    }

    @Override
    public List<AlbumViewModel> findALlCopies()
    {
        return albumRepository.findAll().stream().map(album -> modelMapper.map(album,AlbumViewModel.class)).collect(Collectors.toList());

    }

    @Override
    public List<AlbumViewModel> findAll() {
        return albumRepository.findAll().stream().map(album -> modelMapper.map(album,AlbumViewModel.class)).collect(Collectors.toList());
    }

    @Override
    public void deleteAlbum(Long id) {
         albumRepository.deleteById(id);
    }

}
