package com.example.java_group_11_controlwork_7_ilya_enikeev.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "shops")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}
