package com.tsystems.logiweb.repository;

import com.tsystems.logiweb.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
