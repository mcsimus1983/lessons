package lesson6.HW;

public class Animals {

    protected String name;
    protected int limitRun = 0;
    protected double limitJump = 0;
    protected int limitSail = 0;

    public void setLimit(int limitRun, double limitJump, int limitSail) {
        this.limitRun = limitRun;
        this.limitJump = limitJump;
        this.limitSail = limitSail;
    }

    public Animals(String name) {
        this.name = name;
    }

    public Animals(String name, int limitRun, double limitJump, int limitSail) {
        this.name = name;
        setLimit(limitRun, limitJump, limitSail);
    }

    public void Sail(int length) {
        if (length > limitSail) {
            System.out.println("утонул =(");
        } else if (limitSail == 0) {
            System.out.println("не умеет плавать.");
        } else {
            System.out.printf("проплыл %d метров %n", length);
        }
    }

    public void Run(int length) {
        if (length > limitRun) {
            System.out.println("не смог пробежать");
        } else if (limitRun == 0) {
            System.out.println("не умеет бегать.");
        } else {
            System.out.printf("пробежал %d метров %n", length);
        }
    }

    public void Jump(double height) {
        if (height > limitJump) {
            System.out.println("не смог прыгнуть");
        } else if (limitJump == 0) {
            System.out.println("не умеет прыгать.");
        } else {
            System.out.printf("прыгнул на %.1f метров %n", height);
        }
    }

    @Override
    public String toString() {
        return  name + ":";
    }
}
