package lesson7.oop;

public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat("Борис Николаевич", 3);
        Plate plate = new Plate(5);

        plate.addFood(4);
        plate.printInfo();
        cat.eat(plate);
        plate.printInfo();


    }
}