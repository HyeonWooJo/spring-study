package com.example.javastudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.javastudy.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 특별한 쿼리가 필요하면 여기에 추가 가능
}
