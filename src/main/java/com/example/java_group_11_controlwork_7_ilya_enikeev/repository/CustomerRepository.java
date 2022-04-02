package com.example.java_group_11_controlwork_7_ilya_enikeev.repository;

import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Optional<Customer> getByEmail(String email);

}
