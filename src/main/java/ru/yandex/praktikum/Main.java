package ru.yandex.praktikum;


import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100.0);
        Apple greenApple = new Apple(10, 50, Colour.GREEN_COLOUR);
        Apple redApple = new Apple(8, 60, Colour.RED_COLOUR);
        ShoppingCart.foods = new Food[]{meat, greenApple, redApple};

// Пользовался этим выводом в консоль для отладки кода, оставил в коде для наглядности
//        System.out.println("Мясо");
//        System.out.println(ShoppingCart.foods[0].getAmount());
//        System.out.println(ShoppingCart.foods[0].getDiscount());
//        System.out.println(ShoppingCart.foods[0].getAmount() * ShoppingCart.foods[0].getPrice() * ShoppingCart.foods[0].getDiscount());
//        System.out.println("Яблоки зеленые");
//        System.out.println(ShoppingCart.foods[1].getAmount());
//        System.out.println(ShoppingCart.foods[1].getDiscount());
//        System.out.println(ShoppingCart.foods[1].getAmount() * ShoppingCart.foods[1].getPrice() * ShoppingCart.foods[1].getDiscount());
//        System.out.println("Яблоки красные");
//        System.out.println(ShoppingCart.foods[2].getAmount());
//        System.out.println(ShoppingCart.foods[2].getDiscount());
//        System.out.println(ShoppingCart.foods[2].getAmount() * ShoppingCart.foods[2].getPrice() * ShoppingCart.foods[2].getDiscount());

        System.out.println("Общая сумма товаров без скидки: " + ShoppingCart.getPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + ShoppingCart.getPriceWithDiscount());
        System.out.println("Cумма всех вегетарианских продуктов без скидки: " + ShoppingCart.getPriceForVegetarianWithoutDiscount());
    }
}
