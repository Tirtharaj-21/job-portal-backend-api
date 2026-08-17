package com.indeed.server.Controller;

import com.indeed.server.Constants.APIConstants;
import com.indeed.server.Dto.PostDTO;
import com.indeed.server.Entity.PostModel;
import com.indeed.server.Service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "https://job-portal-frontend-nine-sooty.vercel.app")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping(APIConstants.SAVE_POST)
    public PostModel savepost (@Valid @RequestBody PostDTO postDTO){
//        log.info("Saving post #####");
        return  postService.savepost(postDTO);
    }
    @GetMapping(APIConstants.GET_ALL_POSTS)
    public List<PostModel>getAllPosts(){
//        log.info("Getting all posts ##########");
        return postService.getAllPosts();
    }
}
