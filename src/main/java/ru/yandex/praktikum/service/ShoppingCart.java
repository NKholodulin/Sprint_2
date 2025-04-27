package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {

    public static Food[] foods;

    public ShoppingCart(Food[] foods) {
    }

    public static double getPriceWithoutDiscount() {
        double sum = 0.0;
        for (int i = 0; i < foods.length; i++) {
            sum += foods[i].getAmount() * foods[i].getPrice();
        }
        return sum;
    }

    public static double getPriceWithDiscount() {
        double sum = 0.0;
        double discount = 0.0;
        for (int i = 0; i < foods.length; i++) {
            discount = foods[i].getAmount() * foods[i].getPrice() * foods[i].getDiscount();
            sum += foods[i].getAmount() * foods[i].getPrice() - discount;
        }
        return sum;
    }

    public static double getPriceForVegetarianWithoutDiscount() {
        double sum = 0.0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].getIsVegetarian()) {
                sum += foods[i].getAmount() * foods[i].getPrice();
            } else {
                sum = sum;
            }
        }
        return sum;
    }
}