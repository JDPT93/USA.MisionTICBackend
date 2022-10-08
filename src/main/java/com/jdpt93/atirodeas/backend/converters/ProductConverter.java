package com.jdpt93.atirodeas.backend.converters;

import com.jdpt93.atirodeas.backend.data.ProductData;
import com.jdpt93.atirodeas.backend.documents.Product;

public class ProductConverter extends Converter<Product, ProductData> {

    @Override
    public Product toEntity(ProductData object) {
        return object == null ? null
                : Product.builder()
                        .id(object.getId())
                        .category(object.getCategory())
                        .name(object.getName())
                        .description(object.getDescription())
                        .price(object.getPrice())
                        .stock(object.getStock())
                        .available(object.isAvailable())
                        .image(object.getImage())
                        .build();
    }

    @Override
    public ProductData toData(Product object) {
        return object == null ? null
                : ProductData.builder()
                        .id(object.getId())
                        .category(object.getCategory())
                        .name(object.getName())
                        .description(object.getDescription())
                        .price(object.getPrice())
                        .stock(object.getStock())
                        .available(object.isAvailable())
                        .image(object.getImage())
                        .build();
    }

}
