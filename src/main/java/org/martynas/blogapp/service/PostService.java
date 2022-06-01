package org.martynas.blogapp.service;

import org.martynas.blogapp.model.Post;

import java.util.Collection;
import java.util.Optional;

public interface PostService {

    Optional<Post> getById(Long id);

    Collection<Post> getAll();

    Post save(Post post);
    Optional<Post> getByTitle(String title);
    void delete(Post post);
}

