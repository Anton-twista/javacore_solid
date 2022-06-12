package org.example.basket;

import org.example.product.Product;

public interface IBasket {

    void addProduct(Product product);

    void removeProduct(Product product);

    void clear();

    void print();

    void message();
}