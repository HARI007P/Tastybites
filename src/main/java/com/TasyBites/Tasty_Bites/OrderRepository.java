package com.TasyBites.Tasty_Bites;


import com.TasyBites.Tasty_Bites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
