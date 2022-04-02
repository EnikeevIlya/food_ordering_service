package com.example.java_group_11_controlwork_7_ilya_enikeev.service;

import com.example.java_group_11_controlwork_7_ilya_enikeev.dto.DishDTO;
import com.example.java_group_11_controlwork_7_ilya_enikeev.dto.OrderDTO;
import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Customer;
import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Dish;
import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Order;
import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.CustomerRepository;
import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.DishRepository;
import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class OrderService {

    private final DishRepository dishRepository;
    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;

    public void makeOrder(DishDTO dishDTO, Customer customer) {
        Dish dish = dishRepository.findById(dishDTO.getId()).get();
        Customer customerByEmail = customerRepository.findByEmail(customer.getEmail());
        orderRepository.save(Order.builder()
                .customer(customerByEmail)
                .orderedDish(dish)
                .orderDate(LocalDate.now())
                .build());
    }

    public List<OrderDTO> getOrderListOfCustomer(Customer customer) {
        List<Order> listOrdersByCustomer = orderRepository.findOrderByCustomerEmail(customer.getEmail());
        List<OrderDTO> listOrders = new ArrayList<>();
        if(listOrdersByCustomer.isEmpty()){
            log.error("You need to log in to see your orders");
            throw new NullPointerException();
        }
        listOrdersByCustomer.stream().forEach(eoo -> listOrders.add(OrderDTO.from(eoo)));
        return listOrders;
    }
}
