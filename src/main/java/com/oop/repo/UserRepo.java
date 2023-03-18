package com.oop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oop.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
