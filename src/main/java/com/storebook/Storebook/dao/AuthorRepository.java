package com.storebook.Storebook.dao;

import com.storebook.Storebook.models.Author;
import com.storebook.Storebook.models.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    @Override
    List<Author> findAll();

    @Override
    Author getOne(Integer integer);
}
