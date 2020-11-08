package lesson7.hw;

public class Cat {

    private String name;
    private int appetite;
    private boolean isSatiety;
    public int satiety;


    public Cat(String name, int appetite) {
        this.appetite = appetite;
        this.name = name;
        isSatiety = false;
        satiety = 0;
    }

    public boolean eat(Plate plate) {

        satiety+= doEat(plate);
        if (satiety==appetite){

            isSatiety = true;
        } else {
            isSatiety= false;
        }
        return isSatiety;
    }

    @Override
    public String toString() {
        return "Кот = " + name + ", ест = " + appetite +
                ", сыт = " + isSatiety + ", уровень сытости = " + satiety;
    }

    private int doEat(Plate plate) {
        return plate.decreaseFood(appetite-satiety);
    }

    public void printInfo() {
        System.out.println(this);
    }

    public boolean isSatiety() {
        return isSatiety;
    }
}
