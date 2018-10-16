package com.tsystems.logiweb.repository;

import com.tsystems.logiweb.entity.Truck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckRepository extends JpaRepository<Truck, Integer> {
}
