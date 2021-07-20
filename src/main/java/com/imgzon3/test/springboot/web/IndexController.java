package com.imgzon3.test.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//URL 매핑해주는 컨트롤러
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }// to index.mustache

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
