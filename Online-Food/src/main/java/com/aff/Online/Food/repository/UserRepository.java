package com.aff.Online.Food.repository;

import com.aff.Online.Food.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByEmail(String username);

}
