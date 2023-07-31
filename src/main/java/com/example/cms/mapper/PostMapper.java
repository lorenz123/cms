package com.example.cms.mapper;

import com.example.cms.model.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ef-LORENZ
 */
@Mapper
public interface PostMapper {
    List<Post> getAllPosts();
    Post getPostById(Long id);
    void createPost(Post post);
    void updatePost(Post post);
    void deletePost(Long id);
}
