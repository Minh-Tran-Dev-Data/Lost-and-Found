package com.example.lostandfound.repository;

import com.example.lostandfound.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    // Tìm người dùng theo email (Dùng cho Authentication / Login)
    Optional<User> findByEmail(String email);

    // Kiểm tra email đã tồn tại hay chưa (Dùng khi Register)
    boolean existsByEmail(String email);

}
