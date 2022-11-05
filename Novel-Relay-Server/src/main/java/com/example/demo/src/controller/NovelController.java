package com.example.demo.src.controller;


import com.example.demo.config.BaseException;
import com.example.demo.config.BaseResponse;
import com.example.demo.src.dto.request.PostNovelReq;
import com.example.demo.src.dto.response.GetNovelIdRes;
import com.example.demo.src.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/novel")
public class NovelController {

    private final NovelService novelService;

    @Autowired
    public NovelController(NovelService novelService) {
        this.novelService = novelService;
    }

    @PostMapping("/{category}/create")
    @ResponseBody
    public BaseResponse<Long> createNovel(@PathVariable String category, @RequestBody PostNovelReq postNovelReq) throws BaseException {

        System.out.println(postNovelReq.getKeywords().toString());
        Long novel_id = novelService.createNovel(category,postNovelReq);

        return new BaseResponse<>(novel_id);
    }



}
