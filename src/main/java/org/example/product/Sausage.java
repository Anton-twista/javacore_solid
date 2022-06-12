package org.example.product;

public class Sausage extends Product implements IStorageLife, ICaloric {
    //Magic Numbers Principle - вместо чисел используем константы
    //Open Closed Principle - Имплеметируя интерфейсы мы добавляем
    //классу функциональности, не изменяя его код

    private final String name = "Сосиска";
    private final int price = 250;

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
        System.out.println("Много калорий");
    }
}
