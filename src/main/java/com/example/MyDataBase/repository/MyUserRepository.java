package com.example.MyDataBase.repository;

import com.example.MyDataBase.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {
}
