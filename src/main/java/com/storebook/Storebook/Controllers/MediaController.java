package com.storebook.Storebook.Controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.storebook.Storebook.models.Media;
import com.storebook.Storebook.services.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MediaController {
    @Autowired
    private MediaService mediaService;

    @GetMapping("/media")
    public Iterable<Media> getMedia() {
        return mediaService.getAllMedia();
    }

    @GetMapping("/media/{id}")
    public Media getMediaById(@PathVariable int id) {
        Media media = mediaService.getById(id);
        return media;
    }
}
