package org.example.product;

public class Bread extends Product implements IStorageLife, ICaloric {
    //Single Responsibility Principle - класс Bread описывает только хлеб, а не все продукты
    private final String name = "Хлеб";
    private final int price = 35;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price + " руб.";
    }


    @Override
    public void expiration() {
        System.out.println("Малый срок хранения");
    }

    @Override
    public void howMuch() {
        System.out.println("Много калорий");
    }
}
