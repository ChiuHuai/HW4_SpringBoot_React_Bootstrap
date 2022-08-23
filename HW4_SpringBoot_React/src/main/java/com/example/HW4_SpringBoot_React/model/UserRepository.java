package com.example.HW4_SpringBoot_React.model;

import com.example.HW4_SpringBoot_React.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
