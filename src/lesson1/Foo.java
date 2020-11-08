package lesson1;

import lesson5.Cat;
import lesson5.am.dir1.CatNew;

import java.util.Random;

public class Foo {

    public static void main(String[] args) {
        CatNew catNew = new CatNew();

        catNew.name = "222";
//        catNew.color = "333";

        Random random = new Random();
        Cat cat = new Cat("Тестовый");
        cat.setColor("Рыжий");
        cat.printCat();
    }
}
