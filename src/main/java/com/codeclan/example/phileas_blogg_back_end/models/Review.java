package com.codeclan.example.phileas_blogg_back_end.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="reviews")
public class Review {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="country_id", nullable = true)
    private Country country;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=true)
    private User user;

    @Column
    private String title;

    @Column
    private String text;

    @Column
    private Date date;

    @Column
    private int rating;

    public Review() {
    }

    public Review(Country country, User user, String title, String text, Date date, int rating) {
        this.country = country;
        this.user = user;
        this.title = title;
        this.text = text;
        this.date = date;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
