package lesson6.animals;

public abstract class Animal extends Somebody {

    protected String name;
    private String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Animal " + "name='" + name + '\'' + ", color='" + color + '\'' + ", age=" + age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void voice();

   /* @Override
    public void test() {
        super.test();
        System.out.println("Тестовый метод из Animal!");
    }*/

}
