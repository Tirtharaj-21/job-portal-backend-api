package com.indeed.server.Service;

import com.indeed.server.Dto.PostDTO;
import com.indeed.server.Entity.PostModel;

import java.util.List;

public interface PostService {

    public PostModel savepost (PostDTO postDTO);
    public List<PostModel> getAllPosts();
}
