package com.example.java_group_11_controlwork_7_ilya_enikeev.dto;

import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Dish;
import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Shop;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class DishDTO {
    public static DishDTO from(Dish dish) {
        return builder()
                .id(dish.getId())
                .name(dish.getName())
                .dishType(dish.getDishType())
                .price(dish.getPrice())
                .shop(dish.getShop())
                .build();
    }
    private Long id;
    private String name;
    @JsonProperty("dish_type")
    private String dishType;
    private Integer price;
    @JsonProperty("shop_id")
    private Shop shop;
}
