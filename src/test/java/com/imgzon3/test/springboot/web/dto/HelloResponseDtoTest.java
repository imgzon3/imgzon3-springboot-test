package com.imgzon3.test.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        //@RquiredArgsConstructor 통해 자동으로 생성자가 있음
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        //@Getter 통해 자동으로 get메소드 존재
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
