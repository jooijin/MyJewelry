package com.jooijin.myJewerly.springboot.web;

import com.jooijin.myJewerly.springboot.service.posts.PostsService;
import com.jooijin.myJewerly.springboot.web.dto.PostsResponseDto;
import com.jooijin.myJewerly.springboot.web.dto.PostsSaveRequestDto;
import com.jooijin.myJewerly.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestsDto) {
        return postsService.update(id, requestsDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

}
