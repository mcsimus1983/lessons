package lesson6.cars;

public class BMW extends Car {

    private String interior;

    public BMW(Engine engine, String wheel, String interior) {
        super(engine, wheel);
        this.interior = interior;
    }

}
