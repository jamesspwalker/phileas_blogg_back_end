package com.codeclan.example.phileas_blogg_back_end.controllers;

import com.codeclan.example.phileas_blogg_back_end.models.Country;
import com.codeclan.example.phileas_blogg_back_end.models.Review;
import com.codeclan.example.phileas_blogg_back_end.repositories.CountryRepository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value="/countries")
public class CountryController {

    @Autowired
    CountryRepository countryRepository;

    @GetMapping(value="/{name}")
    public Country getCountryByName(@PathVariable String name) {
        return countryRepository.findByNameIgnoreCase(name);
    }



}
