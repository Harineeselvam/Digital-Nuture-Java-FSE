package com.smartlibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartlibrary.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

}
