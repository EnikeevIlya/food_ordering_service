package com.example.java_group_11_controlwork_7_ilya_enikeev.controller;


import com.example.java_group_11_controlwork_7_ilya_enikeev.dto.ShopDTO;
import com.example.java_group_11_controlwork_7_ilya_enikeev.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/shops")
public class ShopController {
    private final ShopService shopService;

    @GetMapping
    public List<ShopDTO> findAllShops(Pageable pageable) {
        return shopService.findAllShops(pageable);
    }
}
