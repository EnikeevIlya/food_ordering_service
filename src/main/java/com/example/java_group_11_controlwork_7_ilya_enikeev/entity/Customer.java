package com.example.java_group_11_controlwork_7_ilya_enikeev.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
}
