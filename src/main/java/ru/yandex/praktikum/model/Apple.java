package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.constants.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
//        System.out.println(this.colour);
        if (this.colour.equals(Colour.RED_COLOUR)) {
            return Discount.DISCOUNT60;
        } else {
            return Discount.DISCOUNT0;
        }
    }
}
