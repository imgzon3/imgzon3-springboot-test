package com.imgzon3.test.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // JUnit과 스프링부트 테스트 사이의 연결자, SpringRunner 실행자를 사용하게 함
@WebMvcTest(controllers = HelloController.class) // 스프링테스트중, 웹에 집중하는 어노테이션
public class HelloControllerTest {

    @Autowired // 스프링이 관리하는 Bean을 받는다
    private MockMvc mvc; // 웹api 테스트시 사용, HTTP GET, POST등에 대한 API테스트 가능해짐

    @Test // @Test 붙임으로서 해당 함수를 테스트 코드로 만들어 줌
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")) // MockMvc 통해 /hello로 HTTP GET 요청 함
                .andExpect(status().isOk()) // HTTP Header의 STatus 검증, 여기선 200이 아닌지 확인
                .andExpect(content().string(hello)); // "hello" return하는지 검증
    }
}
