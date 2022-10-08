package com.jdpt93.atirodeas.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.jdpt93.atirodeas.backend.converters.ProductConverter;
import com.jdpt93.atirodeas.backend.data.ProductData;
import com.jdpt93.atirodeas.backend.documents.Product;
import com.jdpt93.atirodeas.backend.repositories.ProductRepository;

@Service
public class ProductService {

    private ProductConverter productConverter = new ProductConverter();

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SequenceService sequenceService;

    public ProductData create(ProductData product) {
        if (product.getId() == 0)
            product.setId(sequenceService.next(Product.class.getSimpleName()));
        else if (productRepository.existsById(product.getId()))
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Product already exists");
        return productConverter.toData(productRepository.save(productConverter.toEntity(product)));
    }

    public List<ProductData> readAll() {
        return productConverter.toData(productRepository.findAll());
    }

    public ProductData readById(int id) {
        return productConverter.toData(productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product does not exists")));
    }

    public List<ProductData> readAvailableByCategory(String category) {
        return productConverter.toData(productRepository.findAvailableByCategory(category));
    }

    public List<ProductData> readAvailableByNameLike(String name) {
        return productConverter.toData(productRepository.findAvailableByNameLike(name));
    }

    public List<ProductData> readAvailableByPriceLessThanOrEqualTo(Float price) {
        return productConverter.toData(productRepository.findAvailableByPriceLessThanOrEqualTo(price));
    }

    public List<String> readAllCategories() {
        return productRepository.findAllCategories();
    }

    public ProductData update(ProductData product) {
        ProductData before = this.readById(product.getId());
        productRepository.save(productConverter.toEntity(product));
        return before;
    }

    public ProductData deleteById(int id) {
        ProductData before = this.readById(id);
        productRepository.deleteById(id);
        return before;
    }

}
