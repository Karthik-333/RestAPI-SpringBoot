package com.example.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.digital.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
