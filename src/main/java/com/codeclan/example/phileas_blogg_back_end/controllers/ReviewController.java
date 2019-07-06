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

    @GetMapping(value="/country/{country_id}")
    public List<Review> getReviewsByCountry_id(@PathVariable Long country_id){
        return reviewRepository.findReviewsByCountry_Id(country_id);
    }
}
