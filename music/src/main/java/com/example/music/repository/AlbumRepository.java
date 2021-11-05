package com.example.music.repository;

import com.example.music.model.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Long> {

}
