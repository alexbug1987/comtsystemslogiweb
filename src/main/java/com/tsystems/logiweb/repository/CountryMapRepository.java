package com.tsystems.logiweb.repository;

import com.tsystems.logiweb.entity.CountryMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CountryMapRepository extends JpaRepository<CountryMap, Integer> {


}
