package com.codeclan.example.phileas_blogg_back_end;

import com.codeclan.example.phileas_blogg_back_end.models.Country;
import com.codeclan.example.phileas_blogg_back_end.models.Review;
import com.codeclan.example.phileas_blogg_back_end.models.User;
import org.junit.Before;

public class ReviewTest {

    Review review;
    Country country;
    User user;


    @Before
    public void before(){
        country = new Country("Scotland");
        user = new User("Ed", "Edmund", 2);
        review = new Review(country, user, "Hello", "Scotland is lovely", "2019-10-10", 4);
    }
}
