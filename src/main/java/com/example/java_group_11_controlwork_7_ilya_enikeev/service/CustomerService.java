package com.example.java_group_11_controlwork_7_ilya_enikeev.service;

import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Customer;
import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder encoder;

    public CustomerService(CustomerRepository customerRepository, PasswordEncoder encoder) {
        this.customerRepository = customerRepository;
        this.encoder = encoder;
    }

    public Customer addUser(String name, String email, String password) {
        var a = customerRepository.findByEmail(email);
        if (customerRepository.findByEmail(email) == null){
            var user = Customer.builder()
                    .name(name)
                    .email(email)
                    .password(encoder.encode(password))
                    .build();
            var save = customerRepository.save(user);
            return save;
        }
        else {
            log.error("There is already a user with the given email or login");
            throw new SecurityException();
        }
    }
}
