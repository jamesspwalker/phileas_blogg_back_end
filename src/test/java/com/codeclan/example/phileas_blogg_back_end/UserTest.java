package com.codeclan.example.phileas_blogg_back_end;

import com.codeclan.example.phileas_blogg_back_end.models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    User user;

    @Before
    public void before(){
        user = new User("Ed", "Edmund", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Edmund", user.getName());
    }

    @Test
    public void canChangeName(){
        user.setName("ru");
        assertEquals("ru", user.getName());
    }

    @Test
    public void canGetUsername(){
        assertEquals("Ed", user.getUsername());
    }

    @Test
    public void canSetUsername(){
        user.setUsername("ru");
        assertEquals("ru", user.getUsername());
    }

    @Test
    public void canGetLevel(){
        assertEquals(2, user.getLevel());
    }

    @Test
    public void canSetLevel(){
        user.setLevel(3);
        assertEquals(3, user.getLevel());
    }
    
}
