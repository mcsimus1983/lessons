package lesson6.animals;

public class Duck extends Animal implements Flying, Waterfowl {

    public Duck(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("Кря кря");
    }

    @Override
    public void fly() {
        System.out.println("Утка летит!");
    }

    @Override
    public void swim() {
        System.out.println("Утка плывет");
    }
}
