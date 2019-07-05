package com.codeclan.example.phileas_blogg_back_end.repositories.ReviewRepository;

import com.codeclan.example.phileas_blogg_back_end.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
