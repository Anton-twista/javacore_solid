package org.example.product;

public class Water extends Product implements IStorageLife, ICaloric {
    private final String name = "Вода";
    private final int price = 80;

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
        System.out.println("Средний срок хранения");
    }

    @Override
    public void howMuch() {
        System.out.println("Мало калорий");
    }
}
