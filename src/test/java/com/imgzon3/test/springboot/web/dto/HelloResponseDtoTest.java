//해당 코드는 gradle 4.10.2 버전 기준으로 작성된 것
package com.imgzon3.test.springboot.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test// 테스트 코드로 만들어줌
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
