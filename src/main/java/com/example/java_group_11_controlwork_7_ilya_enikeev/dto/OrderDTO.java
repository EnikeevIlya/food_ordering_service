package com.example.java_group_11_controlwork_7_ilya_enikeev.dto;

import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Customer;
import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Dish;
import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Order;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class OrderDTO {
    public static OrderDTO from(Order order) {
        return builder()
                .id(order.getId())
                .customer(order.getCustomer())
                .orderedDish(order.getOrderedDish())
                .orderDate(order.getOrderDate())
                .build();
    }
    private Long id;
    @JsonProperty("customer_id")
    private Customer customer;
    @JsonProperty("order_id")
    private Dish orderedDish;
    @JsonProperty("order_date")
    private LocalDate orderDate;
}
