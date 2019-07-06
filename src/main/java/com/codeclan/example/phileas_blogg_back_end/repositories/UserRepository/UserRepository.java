package com.codeclan.example.phileas_blogg_back_end.repositories.UserRepository;

import com.codeclan.example.phileas_blogg_back_end.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface UserRepository extends JpaRepository<User, Long> {
}
