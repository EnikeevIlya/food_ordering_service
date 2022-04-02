//package com.example.java_group_11_controlwork_7_ilya_enikeev.util;
//
//import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Customer;
//import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Dish;
//import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Order;
//import com.example.java_group_11_controlwork_7_ilya_enikeev.entity.Shop;
//import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.CustomerRepository;
//import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.DishRepository;
//import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.OrderRepository;
//import com.example.java_group_11_controlwork_7_ilya_enikeev.repository.ShopRepository;
//import lombok.AllArgsConstructor;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import java.time.LocalDate;
//
//@Configuration
//@AllArgsConstructor
//public class InitDatabase {
//    private final PasswordEncoder encoder;
//
//    @Bean
//    CommandLineRunner init(CustomerRepository customerRepository, DishRepository dishRepository,
//                           ShopRepository shopRepository, OrderRepository orderRepository) {
//        return args -> {
////            customerRepository.deleteAll();
////            orderRepository.deleteAll();
////            dishRepository.deleteAll();
////            shopRepository.deleteAll();
//            var customer1 = customerRepository.save(Customer.builder()
//                    .name(GenerateData.randomPersonName())
//                    .email("anton.a@gmail.com")
//                    .password(encoder.encode("qwe"))
//                    .build());
//            var customer2 = customerRepository.save(Customer.builder()
//                    .name(GenerateData.randomPersonName())
//                    .email("pavel.p@gmail.com")
//                    .password(encoder.encode("asd"))
//                    .build());
//            var customer3 = customerRepository.save(Customer.builder()
//                    .name(GenerateData.randomPersonName())
//                    .email("sergey.s@gmail.com")
//                    .password(encoder.encode("zxc"))
//                    .build());
//
//            var ininstitution1 = shopRepository.save(Shop.builder()
//                    .description(GenerateData.randomPlace().description)
//                    .name(GenerateData.randomPlace().name)
//                    .build());
//            var ininstitution2 = shopRepository.save(Shop.builder()
//                    .description(GenerateData.randomPlace().description)
//                    .name(GenerateData.randomPlace().name)
//                    .build());
//            var ininstitution3 = shopRepository.save(Shop.builder()
//                    .description(GenerateData.randomPlace().description)
//                    .name(GenerateData.randomPlace().name)
//                    .build());
//
//            var dish1 = dishRepository.save(Dish.builder()
//                    .name(GenerateData.randomDish().name)
//                    .price(100)
//                    .dishType(GenerateData.randomDish().type)
//                    .shop(ininstitution2)
//                    .build());
//            var dish2 = dishRepository.save(Dish.builder()
//                    .name(GenerateData.randomDish().name)
//                    .price(110)
//                    .dishType(GenerateData.randomDish().type)
//                    .shop(ininstitution1)
//                    .build());
//            var dish3 = dishRepository.save(Dish.builder()
//                    .name(GenerateData.randomDish().name)
//                    .price(120)
//                    .dishType(GenerateData.randomDish().type)
//                    .shop(ininstitution2)
//                    .build());
//
//            var order1 = orderRepository.save(Order.builder()
//                    .orderDate(LocalDate.now())
//                    .orderedDish(dish1)
//                    .customer(customer1)
//                    .build());
//            var order2 = orderRepository.save(Order.builder()
//                    .orderDate(LocalDate.now())
//                    .orderedDish(dish1)
//                    .customer(customer1)
//                    .build());
//            var order3 = orderRepository.save(Order.builder()
//                    .orderDate(LocalDate.now())
//                    .orderedDish(dish2)
//                    .customer(customer2)
//                    .build());
//            var order4 = orderRepository.save(Order.builder()
//                    .orderDate(LocalDate.now())
//                    .orderedDish(dish2)
//                    .customer(customer2)
//                    .build());
//            var order5 = orderRepository.save(Order.builder()
//                    .orderDate(LocalDate.now())
//                    .orderedDish(dish3)
//                    .customer(customer3)
//                    .build());
//            var order6 = orderRepository.save(Order.builder()
//                    .orderDate(LocalDate.now())
//                    .orderedDish(dish3)
//                    .customer(customer3)
//                    .build());
//        };
//    }
//}
