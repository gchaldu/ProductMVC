package com.gchaldu.product.view;

import com.gchaldu.product.model.entities.Product;

import java.util.Scanner;

public class ProductView {

    public void viewProduct(Product product){
        System.out.println("Product name: " + product.getNameProduct());
        System.out.println("Product id: " + product.getId());
    }

    public Product createProduct(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el id");
        Integer id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ingrese el nombre del product");
        String nameProduct = scanner.nextLine();

        Product newProduct = new Product(id, nameProduct);

        return newProduct;
    }
}
