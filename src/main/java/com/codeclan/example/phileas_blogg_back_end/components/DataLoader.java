package com.codeclan.example.phileas_blogg_back_end.components;

import com.codeclan.example.phileas_blogg_back_end.models.Country;
import com.codeclan.example.phileas_blogg_back_end.models.Review;
import com.codeclan.example.phileas_blogg_back_end.models.User;
import com.codeclan.example.phileas_blogg_back_end.repositories.CountryRepository.CountryRepository;
import com.codeclan.example.phileas_blogg_back_end.repositories.ReviewRepository.ReviewRepository;
import com.codeclan.example.phileas_blogg_back_end.repositories.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ReviewRepository reviewRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        Country scotland = new Country("Scotland");
        countryRepository.save(scotland);

        Country england = new Country("England");
        countryRepository.save(england);

        User edmund = new User("Ed", "Edmund", 2);
        userRepository.save(edmund);

        User ru = new User("ru", "Ruairidh", 3);
        userRepository.save(ru);

        User james = new User("js", "James", 5);
        userRepository.save(james);

        Review review1 = new Review(scotland, edmund, "Hello", "Scotland is lovely", "2019-10-10", 4);
        reviewRepository.save(review1);

        Review review2 = new Review(scotland, edmund, "Hello", "Scotland is lovely", "2019-10-11", 4);
        reviewRepository.save(review2);

        Review review3 = new Review(scotland, edmund, "Hello", "Scotland is lovely", "2019-10-10", 4);
        reviewRepository.save(review3);



    }
}
