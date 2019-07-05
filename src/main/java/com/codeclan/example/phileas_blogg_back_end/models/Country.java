package com.codeclan.example.phileas_blogg_back_end.models;

import javax.persistence.*;

@Entity
@Table(name="countries")
public class Country {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
}
