package com.storebook.Storebook.services;

import com.storebook.Storebook.dao.MediaRepository;
import com.storebook.Storebook.models.Media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {

    @Autowired
    private MediaRepository mediaRepository;


    public List<Media> getAllMedia() { return mediaRepository.findAll(); }


    public Media getById(int id) { return mediaRepository.getOne(id); }

}
