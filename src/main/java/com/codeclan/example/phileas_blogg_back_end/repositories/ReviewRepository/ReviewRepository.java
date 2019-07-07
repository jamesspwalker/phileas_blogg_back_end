package com.codeclan.example.phileas_blogg_back_end.repositories.ReviewRepository;

import com.codeclan.example.phileas_blogg_back_end.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findReviewsByDate(String date);

    List<Review> findReviewsByCountryIgnoreCase(String country);

    List<Review> findReviewsByRating(int rating);

    List<Review> findAllByOrderByRatingDesc();

    List<Review> findReviewsByUser_Id(Long user_id);

    List<Review> findByTitleContainingIgnoreCase(String partial_title);

}
