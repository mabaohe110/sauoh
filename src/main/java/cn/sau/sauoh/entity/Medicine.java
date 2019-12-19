package cn.sau.sauoh.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Medicine {
    private Integer id;
    private String name;
    private BigDecimal price;
}