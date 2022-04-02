package com.example.java_group_11_controlwork_7_ilya_enikeev.controller;

import com.example.java_group_11_controlwork_7_ilya_enikeev.dto.DishDTO;
import com.example.java_group_11_controlwork_7_ilya_enikeev.dto.OrderDTO;
import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Customer;
import com.example.java_group_11_controlwork_7_ilya_enikeev.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<String> makeOrder(@RequestBody DishDTO dishDTO, Authentication authentication) {
        try {
            Customer customer = (Customer) authentication.getPrincipal();
            orderService.makeOrder(dishDTO, customer);
            return new ResponseEntity<>("Your order successfully added", HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>("Not found such dish", HttpStatus.BAD_REQUEST);
        } catch (NullPointerException npe) {
            return new ResponseEntity<>("You need to log in to make order", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public List<OrderDTO> getYourOrders(Authentication authentication) {
        try {
            Customer customer = (Customer) authentication.getPrincipal();
            return orderService.getOrderListOfCustomer(customer);
        } catch (NoSuchElementException e) {
            return null;
        }
    }
}
