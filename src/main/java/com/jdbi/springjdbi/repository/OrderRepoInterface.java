package com.jdbi.springjdbi.repository;

import com.jdbi.springjdbi.domain.Order;

import java.util.List;

public interface OrderRepoInterface {
    List<Order> getAllOrder();
}