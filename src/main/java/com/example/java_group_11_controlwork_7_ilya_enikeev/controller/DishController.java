package com.example.java_group_11_controlwork_7_ilya_enikeev.controller;

import com.example.java_group_11_controlwork_7_ilya_enikeev.dto.DishDTO;
import com.example.java_group_11_controlwork_7_ilya_enikeev.dto.ShopDTO;
import com.example.java_group_11_controlwork_7_ilya_enikeev.service.DishService;
import com.example.java_group_11_controlwork_7_ilya_enikeev.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/dishes")
public class DishController {
    private final ShopService shopService;
    private final DishService dishService;

    @GetMapping
    public List<DishDTO> showAllDishesByShop(@RequestBody ShopDTO shop, Pageable pageable) {
        return dishService.findAllDishesByShop(shop, pageable);
    }

}
