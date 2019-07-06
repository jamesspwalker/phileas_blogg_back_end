package com.codeclan.example.phileas_blogg_back_end.controllers;

import com.codeclan.example.phileas_blogg_back_end.models.Review;
import com.codeclan.example.phileas_blogg_back_end.repositories.CountryRepository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value="/countries")
public class CountryController {

    @Autowired
    CountryRepository countryRepository;


}
