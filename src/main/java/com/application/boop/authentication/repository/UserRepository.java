package com.application.boop.authentication.repository;

import com.application.boop.authentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT u FROM User u WHERE u.email = :email and u.id = :id")
    Optional<User> getByEmail(@Param("email") String email, @Param("id") Long id);
}
