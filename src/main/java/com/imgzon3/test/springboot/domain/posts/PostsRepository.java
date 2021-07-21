package com.imgzon3.test.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// Dao와 같은 DB layer 접근자 역할
// 인터페이스 생성하고, JpaRepository<Entity 클래스, pk 타입> 상속받으면 끝
// 단, Entity 클래스와 같은 패키지에 있어야 함
public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();

}
