package br.com.youtube.warehousems.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "tb_warehouse")
@Data
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "id", nullable = false)
    private Long productId;

    @Column(name = "id")
    private int quantity;

}
