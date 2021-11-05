package com.example.music.model.binding;

import com.example.music.model.entity.Artist;
import com.example.music.model.entity.ArtistNameEnum;
import com.example.music.model.entity.GenreEnum;
import com.example.music.model.entity.User;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumAddBindingModel {
    @Min(value = 10,message = "more than 10")
    private int copies;
    @Size(min = 5,message = "min 5 chars")
    private String description;
    @NotNull(message = "you must select genre")
    private GenreEnum genre;
    @Size(min = 5,message = "must be min 5 chars")
    private String image_url;
    @Size(min = 3,max = 20,message = "must be b/n 3 and 20 chars")
    private String name;
    @Positive(message = "must be positive")
    private BigDecimal price;
    private String producer;
    @PastOrPresent(message = "cannot be in the future")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate release_date;
    @NotNull
    private ArtistNameEnum artist;

    public AlbumAddBindingModel() {
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    public void setGenre(GenreEnum genre) {
        this.genre = genre;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDate release_date) {
        this.release_date = release_date;
    }

    public ArtistNameEnum getArtist() {
        return artist;
    }

    public void setArtist(ArtistNameEnum artist) {
        this.artist = artist;
    }
}
