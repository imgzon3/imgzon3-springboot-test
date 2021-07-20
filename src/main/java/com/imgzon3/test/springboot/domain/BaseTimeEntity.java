package com.imgzon3.test.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // JPA Entity 클래스들이 BaseTimeEntity를 상속할 경우, 필드들(createdDate, modifiedDate)도 칼럼으로 인식하게 함
@EntityListeners(AuditingEntityListener.class) // 해당 클래스에 Auditing 기능 포함시킴
                                               // 이는 JPA에서 시간에 대해 자동으로 값을 넣어줌
public class BaseTimeEntity {

    @CreatedDate // Entity가 생성되어 저장될 때 시간이 자동으로 저장됨
    private LocalDateTime createdDate;

    @LastModifiedDate // 조회한 Entity의 값을 변경할 때 시간이 자동저장됨
    private LocalDateTime modifiedDate;
}
