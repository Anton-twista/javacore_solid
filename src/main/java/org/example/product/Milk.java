package org.example.product;

public class Milk extends Product implements IStorageLife, ICaloric {

    private final String name = "Молоко";
    private final int price = 75;

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
        System.out.println("Средне калорий");
    }
}
