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

        Country greatBritain = new Country("United Kingdom of Great Britain and  Northern Ireland");
        countryRepository.save(greatBritain);

        Country afghanistan = new Country("Afghanistan");
        countryRepository.save(afghanistan);

        Country northKorea = new Country("Italy");
        countryRepository.save(northKorea);

        Country myanmar = new Country("Myanmar");
        countryRepository.save(myanmar);

        Country china = new Country("China");
        countryRepository.save(china);

        User edmund = new User("Ed", "Edmund", 789);
        userRepository.save(edmund);

        User ru = new User("ru", "Ruairidh", 32);
        userRepository.save(ru);

        User james = new User("jwalker", "James", 15);
        userRepository.save(james);

        User alison = new User("squiral", "Alison", 568);
        userRepository.save(alison);

        User mateusz = new User("traveller666", "Mateusz", 300);
        userRepository.save(mateusz);

        Review review1 = new Review(afghanistan.getName(), edmund, "Bad First Impressions, but we thoroughly enjoyed our time", "We went for our honeymoon and managed to get a great deal on flights and an all inclusive resort for 10 days.", "2019-10-10", 4);
        reviewRepository.save(review1);

        Review review2 = new Review(greatBritain.getName(), ru, "Britain is cool", "I've lived here a while now and it's pretty cool", "2019-10-11", 4);
        reviewRepository.save(review2);

        Review review3 = new Review(afghanistan.getName(), james, "Cool Mountains", "Pretty cool mountains, that's about it", "2019-10-10", 2);
        reviewRepository.save(review3);

        Review review4 = new Review(northKorea.getName(), alison, "Loved Italy!", "Really enjoyed our time in Italy, it is beautiful.", "2017-09-05", 5 );
        reviewRepository.save(review4);

        Review review5 = new Review(china.getName(), mateusz, "Amazing history", "China is amazing, I just lived all the history. The great wall was a highlight of the trip.", "2015-04-04", 5);
        reviewRepository.save(review5);
        
    }
}
