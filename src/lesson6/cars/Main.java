package lesson6.cars;

public class Main {

    public static void main(String[] args) {

        Car starCar = new BMW(new Engine(), "красивые", "кожаный");
        Car gazel = new Gazel(new Engine(), "потрепанные", 18);
        Car gruzovik = new Scania(new Engine(), "большие", "грузовой");

//        Car car = new Car(new Engine(), "красивые", "кожаный");

        starCar.run();
        gazel.run();
        gruzovik.run();
    }
}
