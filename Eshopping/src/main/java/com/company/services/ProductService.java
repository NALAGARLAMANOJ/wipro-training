package com.company.services;

import com.company.dao.ProductDAO;
import com.company.model.Product;

public class ProductService {

    ProductDAO dao = new ProductDAO();

    public void addProduct(Product product) {
        dao.addProduct(product);
    }

    public void viewProducts() {
        dao.getAllProducts();
    }
}