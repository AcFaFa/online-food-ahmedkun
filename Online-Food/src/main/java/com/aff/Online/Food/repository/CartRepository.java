package com.aff.Online.Food.repository;

import com.aff.Online.Food.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
