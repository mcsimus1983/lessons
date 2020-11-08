package lesson6.cars;

public abstract class Car {

    private Engine engine;
    private String wheel;

    public Car(Engine engine, String wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void run() {
        turnKey();
        startEngine();
        turnOnGear(1);
    }

    private void startEngine() {
        System.out.println("Запускаем двигатель");
        engine.start = true;
    }

    private void turnKey() {
        System.out.println("Повернули ключ");
    }

    private void turnOnGear(int gear) {
        if (gear < 0 || gear > 6) {
            System.out.println("Не завелась!");
            System.exit(0);
        }
        System.out.println("Зпаускаем передачу " + gear);
    }

}
