package com.example.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String title;
    @Column( columnDefinition = "text")
    private String description;
    @Column
    private int price;
    @Column(name = "city")
    private String city;
    @Column(name = "author")
    private String author;
}
