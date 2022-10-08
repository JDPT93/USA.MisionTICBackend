package com.jdpt93.atirodeas.backend.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ProductData {

    private int id;
    private String category;
    private String name;
    private String description;
    private float price;
    private float stock;
    private boolean available;
    private String image;

}
