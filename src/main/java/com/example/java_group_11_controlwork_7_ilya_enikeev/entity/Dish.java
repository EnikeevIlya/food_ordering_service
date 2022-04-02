package com.example.java_group_11_controlwork_7_ilya_enikeev.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "dishes")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(name = "dish_type")
    private String dishType;
    private Integer price;
    @OneToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;
}
