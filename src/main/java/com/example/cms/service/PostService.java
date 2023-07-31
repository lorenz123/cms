package com.example.cms.service;

import com.example.cms.mapper.PostMapper;
import com.example.cms.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ef-LORENZ
 */
@Service
public class PostService {
    private final PostMapper postMapper;

    @Autowired
    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public List<Post> getAllPosts() {
        return postMapper.getAllPosts();
    }

    public Post getPostById(Long id) {
        return postMapper.getPostById(id);
    }

    public void createPost(Post post) {
        postMapper.createPost(post);
    }

    public void updatePost(Post post) {
        postMapper.updatePost(post);
    }

    public void deletePost(Long id) {
        postMapper.deletePost(id);
    }
}
