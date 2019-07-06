package com.codeclan.example.phileas_blogg_back_end.repositories.UserRepository;

import com.codeclan.example.phileas_blogg_back_end.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameIgnoreCase(String username);

    List<User> findByLevel(int level);

    List<User> findAllByOrderByLevelDesc();

    List<User> findByUsernameContainingIgnoreCase(String partial_username);
}
