package lesson6.HW;

public class Cat extends Animals {

    public Cat(String name, int limitRun, int limitJump, int limitSail) {
        super(name);
        super.setLimit(limitRun,limitJump,limitSail);
    }

}
