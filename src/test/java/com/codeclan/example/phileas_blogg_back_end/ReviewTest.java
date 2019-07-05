package com.codeclan.example.phileas_blogg_back_end;

import com.codeclan.example.phileas_blogg_back_end.models.Country;
import com.codeclan.example.phileas_blogg_back_end.models.Review;
import com.codeclan.example.phileas_blogg_back_end.models.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.TestExecutionListeners;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void canGetTitle(){
        assertEquals("Hello", review.getTitle());
    }

    @Test
    public void canSetTitle(){
        review.setTitle("I am a title");
        assertEquals("I am a title", review.getTitle());
    }

    @Test
    public void canGetText(){
        assertEquals("Scotland is lovely", review.getText());
    }

    @Test
    public void canSetText(){
        review.setText("Scotland is busy in Edinburgh");
        assertEquals("Scotland is busy in Edinburgh", review.getText());
    }

    @Test
    public void canGetDate(){
        assertEquals("2019-10-10", review.getDate());
    }

    @Test
    public void canSetDate(){
        review.setDate("2019-11-11");
        assertEquals("2019-11-11", review.getDate());
    }

    @Test
    public void canGetRating(){
        assertEquals(4, review.getRating());
    }

    @Test
    public void canSetRating(){
        review.setRating(5);
        assertEquals(5, review.getRating());
    }

    @Test
    public void reviewHasAUser(){
        assertEquals("Ed", review.getUser().getUsername());
    }

    @Test
    public void reviewHasACountry(){
        assertEquals("Scotland", review.getCountry().getName());
    }
}
