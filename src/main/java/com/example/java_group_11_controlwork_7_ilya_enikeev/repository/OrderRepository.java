package com.example.java_group_11_controlwork_7_ilya_enikeev.repository;

import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
