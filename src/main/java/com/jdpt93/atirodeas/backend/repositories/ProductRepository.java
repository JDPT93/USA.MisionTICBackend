package com.jdpt93.atirodeas.backend.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.jdpt93.atirodeas.backend.documents.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {

    @Aggregation(pipeline = "{ $group : { _id : $category } }")
    public List<String> findAllCategories();

    @Query(value = "{ available: true, category: '?0' }")
    public List<Product> findAvailableByCategory(String category);

    @Query(value = "{ available: true, name: { $regex: '?0', $options: 'i' } }")
    public List<Product> findAvailableByNameLike(String name);

    @Query(value = "{ available: true, price: { $lte: ?0 } }")
    public List<Product> findAvailableByPriceLessThanOrEqualTo(float price);

}
