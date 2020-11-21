package lesson6.animals;

import lesson6.cars.BMW;
import lesson6.cars.Engine;

public class Main {

    public static void main(String[] args) {
        Horse horse = new Horse("Спирит", "гнедой", 3);
        Dog dog = new Dog("Гендальф", "серый", 9, "Борис Николаевич");
        Duck duck = new Duck("Дональд", "белая", 1);
        Airbus airbus = new Airbus();


        dog.printInfo();


        Animal[] animals = {horse, dog};

        for (Animal animal : animals) {
            animal.voice();
        }

//        ((Dog)dog).doAport();

/*        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            animal.voice();
            if (animal instanceof Dog) {
                ((Dog) animal).doAport();
            }
        }*/

        Object[] objects = {dog, new String("String"), new int[4], new BMW(new Engine(), "красивые", "кожаный"),
                Integer.valueOf(2), duck, airbus };

        for (Object object : objects) {
            System.out.println(object.toString());

            if (object instanceof Flying) {
                ((Flying)object).fly();
            }
        }

/*        test(horse);
        test(dog);*/



        /*test3(dog);
        test2(airbus);
        test2(duck);

        test3(duck);
*/
    }

    public static void test(Animal animal) {
        animal.printInfo();
    }

    public static void test2(Flying flyObject) {
        flyObject.fly();
    }

    public static void test3(Waterfowl waterfowlObj) {

        waterfowlObj.swim();

    }

}