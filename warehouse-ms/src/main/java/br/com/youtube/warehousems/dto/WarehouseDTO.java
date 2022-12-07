package br.com.youtube.warehousems.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class WarehouseDTO {

    private Long productId;
    private int quantity;

}
