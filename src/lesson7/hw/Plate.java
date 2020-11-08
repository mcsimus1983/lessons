package lesson7.hw;

public class Plate {

    private int capacity;
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public void addFood(int food) {
        this.food = Math.min(this.food + food, capacity);
    }

    @Override
    public String toString() {

        return "вместимость= " + capacity + ", осталось еды =" + food;
    }

    public void printInfo() {
        System.out.println(this);
    }

    public int decreaseFood(int appetite) {
        if (appetite < this.food) {
            this.food -= appetite;
            return appetite;
        }else {
            int countFood = this.food;
            this.food = 0;
            return countFood;
        }
    }
}
