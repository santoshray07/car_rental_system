package com.shounoop.carrentalspring.repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shounoop.carrentalspring.entity.User;
import com.shounoop.carrentalspring.enums.UserRole;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findFirstByEmail(String email);

    ArrayList<User> findByUserRole(UserRole userRole);
}
