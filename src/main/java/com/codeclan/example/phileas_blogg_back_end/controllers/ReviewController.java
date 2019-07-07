package com.codeclan.example.phileas_blogg_back_end.controllers;

import com.codeclan.example.phileas_blogg_back_end.models.Review;
import com.codeclan.example.phileas_blogg_back_end.repositories.ReviewRepository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value="/reviews")
public class ReviewController {

    @Autowired
    ReviewRepository reviewRepository;

    @GetMapping(value="/date/{date}")
    public List<Review> getReviewsByDate(@PathVariable String date){
        return reviewRepository.findReviewsByDate(date);
    }

//    @GetMapping(value="/country/{country_id}")
//    public List<Review> getReviewsByCountry_id(@PathVariable Long country_id){
//        return reviewRepository.findReviewsByCountry_Id(country_id);
//    }

    @GetMapping(value="/user/{user_id}")
    public List<Review> getReviewsByUser_id(@PathVariable Long user_id){
        return reviewRepository.findReviewsByUser_Id(user_id);
    }

    @GetMapping(value="/rating/{rating}")
    public List<Review> getReviewsByRating(@PathVariable int rating){
        return reviewRepository.findReviewsByRating(rating);
    }

    @GetMapping(value="/ranking")
    public List<Review> getReviewsByRatingDesc(){
        return reviewRepository.findAllByOrderByRatingDesc();
    }

    @GetMapping(value="/contains/{partial_title}")
    public List<Review> getReviewsByPartialTitle(@PathVariable String partial_title){
        return reviewRepository.findByTitleContainingIgnoreCase(partial_title);
    }

}
