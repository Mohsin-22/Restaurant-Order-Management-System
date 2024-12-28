package com.ust.order_service.service;


import com.ust.order_service.model.Order;
import com.ust.order_service.model.OrderStatus;
import com.ust.order_service.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // Method to save an order
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    // Method to get all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Method to get orders by restaurant ID
    public List<Order> getOrdersByRestaurantId(Long restaurantId) {
        return orderRepository.findByRestaurantId(restaurantId);
    }

    // Method to get an order by ID
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
    }

    // Method to update order status
    public Order updateOrderStatus(Long id, OrderStatus status) {
        Order order = getOrderById(id);
        order.setStatus(status);
        return orderRepository.save(order);
    }

    // Method to delete an order by ID
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
