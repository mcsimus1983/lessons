package lesson7.hw;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.appetite = appetite;
        this.name = name;
        satiety = false;
    }

    public void CheckSatiety() {
        if (satiety) {
            System.out.println("Кот " + name + " сыт.");
        } else {
            System.out.println("Кот " + name + " голоден.");
        }
    }

    public boolean eat(Plate plate) {

        if (plate.getFood() >= appetite) {
            doEat(plate);
            satiety = true;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Кот = " + name + ", ест = " + appetite +
                ", сыт = " + satiety;
    }

    private void doEat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public void printInfo() {
        System.out.println(this);
    }

    public boolean isSatiety() {
        return satiety;
    }
}
