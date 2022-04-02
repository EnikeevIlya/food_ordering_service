package com.example.java_group_11_controlwork_7_ilya_enikeev.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Dish orderedDish;
    @Column(name = "order_date")
    private LocalDate orderDate;
}
