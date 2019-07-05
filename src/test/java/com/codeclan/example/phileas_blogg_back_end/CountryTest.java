package com.codeclan.example.phileas_blogg_back_end;

import com.codeclan.example.phileas_blogg_back_end.models.Country;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountryTest {

    Country country;

    @Before
    public void before(){
        country = new Country("Scotland");
    }

    @Test
    public void canGetCountryName(){
        assertEquals("Scotland", country.getName());
    }

    @Test
    public void canSetCountryName(){
        country.setName("England");
        assertEquals("England", country.getName());
    }
}
