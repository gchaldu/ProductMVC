package com.gchaldu.product.controller;

import com.gchaldu.product.model.entities.Product;
import com.gchaldu.product.model.repositories.ProductRepository;
import com.gchaldu.product.view.ProductView;

public class ProductController {

    private ProductView productView;
    private ProductRepository productRepository;

    public ProductController(ProductView productView, ProductRepository productRepository) {
        this.productView = productView;
        this.productRepository = productRepository;
    }

    public void createProduct(){
        //crear producto
        Product product = this.productView.createProduct();
        //guardar product
        this.productRepository.addListProduct(product);
        //mostrar el product
        this.productView.viewProduct(product);
    }
}
