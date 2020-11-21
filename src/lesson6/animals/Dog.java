package lesson6.animals;

public class Dog extends Animal implements Waterfowl {

    protected String name;

    public Dog(String name, String color, int age, String secondName) {
        super(name, color, age);
        this.name = secondName;
    }

    public Dog(String name, String color, int age) {
        this(name, color, age, "");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Настоящее имя собаки: " + name);
        System.out.println("Второе имя собаки: " + super.name);
    }

    @Override
    public void voice() {
        System.out.println("Гау гау");
    }

    public void doAport() {
        System.out.println("Собака " + name + " принесла палку");
    }

    @Override
    public void swim() {
        System.out.println("Собака плывет");
    }
}
