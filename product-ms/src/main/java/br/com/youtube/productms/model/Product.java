package br.com.youtube.productms.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb-product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "available")
    private boolean available;

}
