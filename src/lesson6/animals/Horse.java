package lesson6.animals;

public class Horse extends Animal {

    private boolean saddle = false;

    public Horse(String name, String color, int age) {
        super(name, color, age);
        this.name = "";
    }

    @Override
    public void printInfo() {
        System.out.println("Метод у лошади!");
    }

    @Override
    public void voice() {
        System.out.println("Добрый вечер");
    }

    @Override
    public void test() {
        super.test();
        System.out.println("Тестовый метод из лошади!");
    }
}
