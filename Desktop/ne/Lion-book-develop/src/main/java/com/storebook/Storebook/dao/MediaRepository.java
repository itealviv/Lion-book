package com.storebook.Storebook.dao;

import com.storebook.Storebook.models.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaRepository extends JpaRepository<Media, Integer> {
    @Override
    List<Media> findAll();

    @Override
    Media getOne(Integer integer);


}
