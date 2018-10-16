package com.tsystems.logiweb.repository;

import com.tsystems.logiweb.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DriverRepository extends JpaRepository<Driver, Integer>{
    @Query("select b from Driver b where b.name = :name")
    Driver findByName(@Param("name") String name);


}
