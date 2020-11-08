package lesson6.cars;

public class Scania extends Car{

    private String body;


    public Scania(Engine engine, String wheel, String body) {
        super(engine, wheel);
        this.body = body;
    }
}
