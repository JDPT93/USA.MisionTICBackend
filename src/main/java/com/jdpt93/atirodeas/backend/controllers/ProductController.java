package com.jdpt93.atirodeas.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jdpt93.atirodeas.backend.data.ProductData;
import com.jdpt93.atirodeas.backend.services.ProductService;

@RestController
@RequestMapping("api/products")
@CrossOrigin(origins = "*", methods = {
        RequestMethod.GET,
        RequestMethod.POST,
        RequestMethod.PUT,
        RequestMethod.DELETE
})
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<?> readAll() throws InterruptedException {
        return new ResponseEntity<>(productService.readAll(), HttpStatus.OK);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<?> readById(@PathVariable int id) {
        return new ResponseEntity<>(productService.readById(id), HttpStatus.OK);
    }

    @GetMapping(path = "available/by-category/{category}")
    public ResponseEntity<?> readAvailableByCategory(@PathVariable String category) {
        return new ResponseEntity<>(productService.readAvailableByCategory(category), HttpStatus.OK);
    }

    @GetMapping(path = "available/by-name/like/{name}")
    public ResponseEntity<?> readAvailableByNameLike(@PathVariable String name) {
        return new ResponseEntity<>(
                productService.readAvailableByNameLike(name.replaceAll("[$(-+.\\/?\\[-^{-}]", "\\$0")),
                HttpStatus.OK);
    }

    @GetMapping(path = "available/by-price/less-than-or-equal-to/{price}")
    public ResponseEntity<?> readAvailableByPriceLessThanOrEqualTo(@PathVariable Float price) {
        return new ResponseEntity<>(productService.readAvailableByPriceLessThanOrEqualTo(price), HttpStatus.OK);
    }

    @GetMapping(path = "categories")
    public ResponseEntity<?> readAllCategories() {
        return new ResponseEntity<>(productService.readAllCategories(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> insert(@RequestBody ProductData product) {
        return new ResponseEntity<>(productService.create(product), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody ProductData product) {
        return new ResponseEntity<>(productService.update(product), HttpStatus.OK);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id) {
        return new ResponseEntity<>(productService.deleteById(id), HttpStatus.OK);
    }

}
