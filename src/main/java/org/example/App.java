package org.example;

import org.example.basket.Basket;
import org.example.product.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Basket basket = new Basket();

        Product[] products = {new Water(),
                new Cheese(),
                new Bread(),
                new Milk(),
                new Sausage()
        };

        while (true) {
            System.out.println("Выберите действие: \n" +
                    "1. Посмотреть ассортимент. \n" +
                    "2. Ваша корзина. \n" +
                    "3. Добваить в корзину. \n" +
                    "4. Удалить из корзины. \n" +
                    "5. Очистить корзину. \n" +
                    "0. ВЫйти из магазина. \n" +
                    "");
            String scan = scanner.nextLine();
            if (scan.equals("0")) {
                System.out.println("Вы вышли из магагзина");
                break;
            }

            int number = Integer.parseInt(scan);
            switch (number) {
                case 1:
                    System.out.println("Вы выбрали 1. Посмотреть ассортимент. \n");
                    printProducts(products);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Вы выбрали 2. Ваша корзина. \n");
                    basket.print();
                    break;

                case 3:
                    System.out.println("Вы выбрали 3. Добваить в корзину. \n" + "Введите код товара и количество \n" +
                            "Введите 0, чтобы выйти и посмотреть что в корзине\n");
                    while (true) {
                        String choice = scanner.nextLine();
                        if (choice.equals("0")) {
                            System.out.println();
                            break;
                        }
                        String[] parts = choice.split(" ");
                        int productNumber = Integer.parseInt(parts[0]) - 1;
                        products[productNumber].addCount(Integer.parseInt(parts[1])); //количество продукта
                        basket.addProduct(products[productNumber]);
                    }
                    break;

                case 4:
                    System.out.println("Вы выбрали 4. Удалить из корзины \n" +
                            "Введите код товара который нужно удалить: \n" +
                            "0 чтобы выйти \n");
                    basket.print();
                    while (true) {
                        String choice = scanner.nextLine();
                        if (choice.equals("0")) {
                            System.out.println();
                            break;
                        }
                        int productNumberDelete = Integer.parseInt(choice) - 1;
                        basket.removeProduct(products[productNumberDelete]);
                        System.out.println("Продукт удалён!");
                        basket.print();
                    }
                    break;

                case 5:
                    System.out.println("Вы выбрали 5. Очистить корзину \n");
                    basket.clear();
                    basket.message();
                    break;
            }
        }
    }

    //DRY - повторяющийся метод
    public static void printProducts(Product[] products) {
        System.out.println("Список возможных товаров для покупки");
        // Magic - вместо числа используем products.length
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].setCode(i + 1) + ". " + products[i]);
        }
    }
}