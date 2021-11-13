package com.github.tetsab.citiesapi.countries.repository;

import com.github.tetsab.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
