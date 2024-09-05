package com.meusestudos.course.services;

import com.meusestudos.course.entities.Order;
import com.meusestudos.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll()  {
        return orderRepository.findAll();
    }

    public Order findById(Long orderId) {
        Optional<Order> order = orderRepository.findById(orderId);
        return order.get();
    }

}