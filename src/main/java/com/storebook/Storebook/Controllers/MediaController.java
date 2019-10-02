package com.storebook.Storebook.Controllers;


import com.storebook.Storebook.models.Media;
import com.storebook.Storebook.services.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://store-book.tk", maxAge = 3600)
@RestController
public class MediaController {
    @Autowired
    private MediaService mediaService;

    @GetMapping("/media")
    public List<Media> getMedia() {
        return mediaService.getAllMedia();
    }

    @GetMapping("/media/{id}")
    public Media getMediaById(@PathVariable int id) {
        return mediaService.getById(id);
    }
}
