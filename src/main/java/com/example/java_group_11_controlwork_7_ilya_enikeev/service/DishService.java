package com.example.java_group_11_controlwork_7_ilya_enikeev.service;

import com.example.java_group_11_controlwork_7_ilya_enikeev.dto.DishDTO;
import com.example.java_group_11_controlwork_7_ilya_enikeev.dto.ShopDTO;
import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Dish;
import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Shop;
import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.DishRepository;
import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.ShopRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class DishService {

    private final DishRepository dishRepository;
    private final ShopRepository shopRepository;

    public List<DishDTO> findAllDishesByShop(ShopDTO shopDTO, Pageable pageable) {
        Shop shop = shopRepository.findById(shopDTO.getId()).get();
        List <Dish> dishes = dishRepository.findDishByShop(shop, pageable);
        List<DishDTO> listDishes = new ArrayList<>();
        dishes.forEach(eod -> listDishes.add(DishDTO.from(eod)));
        return listDishes;
    }
}
