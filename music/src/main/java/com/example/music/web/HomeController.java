package com.example.music.web;

import com.example.music.model.view.AlbumViewModel;
import com.example.music.service.AlbumService;
import com.example.music.util.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final CurrentUser currentUser;
    private final AlbumService albumService;

    public HomeController(CurrentUser currentUser, AlbumService albumService) {
        this.currentUser = currentUser;
        this.albumService = albumService;
    }

    @GetMapping
    public String index(Model model) {

        if (currentUser.getId() == null) {
            return "index";
        }
        List<AlbumViewModel> album = albumService.findAll();
        model.addAttribute("album", album);

        model.addAttribute("totalCopies", album
                .stream()
                .map(albumViewModel -> albumViewModel.getCopies())
                .reduce(Integer::sum)
                .orElse(0)
        );
        return "home";

    }
}
