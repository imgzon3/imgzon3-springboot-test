//gradle 4.10.2에 맞추어 짐, 추후에 새로운 버전의 gradle에서 방법 검색해 보기
package com.imgzon3.test.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 선언한 모든 필드의 get 생성해줌
@RequiredArgsConstructor // 선언된 모든 "final"붙은 필드의 생성자 생성해 줌
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
