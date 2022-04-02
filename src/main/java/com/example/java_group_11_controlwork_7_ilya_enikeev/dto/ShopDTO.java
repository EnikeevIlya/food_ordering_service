package com.example.java_group_11_controlwork_7_ilya_enikeev.dto;

import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Shop;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShopDTO {
    public static ShopDTO from(Shop shop) {
        return builder()
                .id(shop.getId())
                .name(shop.getName())
                .description(shop.getDescription())
                .build();
    }

    private Long id;
    private String name;
    private String description;
}
