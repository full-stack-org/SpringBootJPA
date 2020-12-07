package com.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
