package com.codeclan.example.phileas_blogg_back_end.repositories.CountryRepository;


import com.codeclan.example.phileas_blogg_back_end.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface CountryRepository extends JpaRepository<Country, Long> {

    Country findByNameIgnoreCase(String name);
}
