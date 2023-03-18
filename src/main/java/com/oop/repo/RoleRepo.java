package com.oop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oop.entity.Role;

public interface RoleRepo extends JpaRepository<Role,Integer>{

}
