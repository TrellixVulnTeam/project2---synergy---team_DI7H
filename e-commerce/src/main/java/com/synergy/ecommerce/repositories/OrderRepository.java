package com.synergy.ecommerce.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.synergy.ecommerce.entities.Order
;
public interface OrderRepository extends JpaRepository<Order, Long>{

	Optional<Order> findOrderByOrderDate(Date orderDate);
}
