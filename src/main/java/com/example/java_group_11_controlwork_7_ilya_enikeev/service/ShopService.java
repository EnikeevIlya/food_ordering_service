package com.example.java_group_11_controlwork_7_ilya_enikeev.service;

import com.example.java_group_11_controlwork_7_ilya_enikeev.dto.ShopDTO;
import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Shop;
import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.ShopRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ShopService {

    private final ShopRepository shopRepository;

    public List<ShopDTO> findAllShops(Pageable pageable) {
        List <Shop> shop = shopRepository.findAll(pageable);
        List<ShopDTO> listShops = new ArrayList<>();
        shop.forEach(c -> listShops.add(ShopDTO.from(c)));
        return listShops;
    }
}
