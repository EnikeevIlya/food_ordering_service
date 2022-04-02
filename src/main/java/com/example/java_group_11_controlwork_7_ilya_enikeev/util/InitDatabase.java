package com.example.java_group_11_controlwork_7_ilya_enikeev.util;

import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Customer;
import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Dish;
import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Order;
import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Shop;
import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.CustomerRepository;
import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.DishRepository;
import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.OrderRepository;
import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.ShopRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;

@Configuration
@AllArgsConstructor
public class InitDatabase {
    private final PasswordEncoder encoder;

    @Bean
    CommandLineRunner init(CustomerRepository customerRepository, DishRepository dishRepository,
                           ShopRepository shopRepository, OrderRepository orderRepository) {
        return args -> {
            Customer customer1 = customerRepository.save(Customer.builder()
                    .name(GenerateData.randomPersonName())
                    .email("aleksei@gmail.com")
                    .password(encoder.encode("123"))
                    .build());
            Customer customer2 = customerRepository.save(Customer.builder()
                    .name(GenerateData.randomPersonName())
                    .email("ilya@gmail.com")
                    .password(encoder.encode("456"))
                    .build());
            Customer customer3 = customerRepository.save(Customer.builder()
                    .name(GenerateData.randomPersonName())
                    .email("andrew@gmail.com")
                    .password(encoder.encode("789"))
                    .build());

            Shop ininstitution1 = shopRepository.save(Shop.builder()
                    .description(GenerateData.randomPlace().description)
                    .name(GenerateData.randomPlace().name)
                    .build());
            Shop ininstitution2 = shopRepository.save(Shop.builder()
                    .description(GenerateData.randomPlace().description)
                    .name(GenerateData.randomPlace().name)
                    .build());
            Shop ininstitution3 = shopRepository.save(Shop.builder()
                    .description(GenerateData.randomPlace().description)
                    .name(GenerateData.randomPlace().name)
                    .build());

            Dish dish1 = dishRepository.save(Dish.builder()
                    .name(GenerateData.randomDish().name)
                    .price(100)
                    .dishType(GenerateData.randomDish().type)
                    .shop(ininstitution2)
                    .build());
            Dish dish2 = dishRepository.save(Dish.builder()
                    .name(GenerateData.randomDish().name)
                    .price(110)
                    .dishType(GenerateData.randomDish().type)
                    .shop(ininstitution1)
                    .build());
            Dish dish3 = dishRepository.save(Dish.builder()
                    .name(GenerateData.randomDish().name)
                    .price(120)
                    .dishType(GenerateData.randomDish().type)
                    .shop(ininstitution2)
                    .build());

            orderRepository.save(Order.builder()
                    .orderDate(LocalDate.now())
                    .orderedDish(dish1)
                    .customer(customer1)
                    .build());
            orderRepository.save(Order.builder()
                    .orderDate(LocalDate.now())
                    .orderedDish(dish1)
                    .customer(customer1)
                    .build());
            orderRepository.save(Order.builder()
                    .orderDate(LocalDate.now())
                    .orderedDish(dish2)
                    .customer(customer2)
                    .build());
            orderRepository.save(Order.builder()
                    .orderDate(LocalDate.now())
                    .orderedDish(dish3)
                    .customer(customer3)
                    .build());
            orderRepository.save(Order.builder()
                    .orderDate(LocalDate.now())
                    .orderedDish(dish3)
                    .customer(customer1)
                    .build());
            orderRepository.save(Order.builder()
                    .orderDate(LocalDate.now())
                    .orderedDish(dish1)
                    .customer(customer2)
                    .build());
            orderRepository.save(Order.builder()
                    .orderDate(LocalDate.now())
                    .orderedDish(dish2)
                    .customer(customer3)
                    .build());
        };
    }
}
