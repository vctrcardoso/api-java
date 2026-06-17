package com.paulo.api_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.api_java.entities.OrderItem;
import com.paulo.api_java.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	

}
