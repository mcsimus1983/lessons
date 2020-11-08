package lesson6.cars;

public class Gazel extends Car {

    public int seatCount;


    public Gazel(Engine engine, String wheel, int seatCount) {
        super(engine, wheel);
        this.seatCount = seatCount;
    }
}
