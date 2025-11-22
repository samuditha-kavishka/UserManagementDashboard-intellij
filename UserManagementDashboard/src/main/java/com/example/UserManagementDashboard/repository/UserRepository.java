package com.example.UserManagementDashboard.repository;

import com.example.UserManagementDashboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}