package org.example.basket;

import org.example.product.Product;

import java.util.*;

public class Basket implements IBasket {

    //Single responsibility principle. Класс выполняет только те методы, что связаны с корзиной продуктов

    protected final List<Product> basketList;

    public Basket() {
        basketList = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        basketList.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        basketList.remove(product);
    }

    @Override
    public void clear() {
        basketList.clear();
    }

    @Override
    public void message() {
        System.out.println("В коризне пусто");
    }

    //DRY - повторяющийся метод
    @Override
    public void print() {
        int sumProducts = 0;
        System.out.println("Ваша корзина:");
        System.out.println("Код Наименование товара  Количество  Цена/ед  Общая стоимость");
        for (Product product : basketList) {
            if (product.getCount() != 0) {
                sumProducts += product.getCount() * product.getPrice();
                System.out.printf("%-5s %-15s %6d %12d %12d \n", product.getCode(), product.getName(),
                        product.getCount(), product.getPrice(), product.getCount() * product.getPrice());
            }
        }
        System.out.printf("%40s %7d \n", "Итого: ", sumProducts);
    }
}
