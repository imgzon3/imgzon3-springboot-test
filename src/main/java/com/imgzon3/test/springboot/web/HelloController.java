package com.imgzon3.test.springboot.web;

import com.imgzon3.test.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // 컨트롤러를 JSON 반환하는 컨트롤러로 만들어줌
public class HelloController {

    @GetMapping("/hello") // HTTP GET을 받는 컨트롤러로 만들어줌
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
