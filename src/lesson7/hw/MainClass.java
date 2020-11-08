package lesson7.hw;

public class MainClass {


    public static void main(String[] args) {

        Cat[] arrCats = createArrCats();
        Plate[] plats = createArrPlats();

        fillPlats(plats);

        printInfo(plats);
        startFeeding(arrCats, plats);
        printInfo(arrCats);
        printInfo(plats);

    }

    private static void startFeeding(Cat[] arrCats, Plate[] plats) {
        for (Cat arrCat : arrCats) {
            for (Plate plat : plats) {

                if (plat.getFood() != 0 && !arrCat.isSatiety()) {
                    if (arrCat.eat(plat)) {
                        break;
                    }

                }

            }
        }
    }

    private static void printInfo(Plate[] plate) {
        for (Plate value : plate) {
            value.printInfo();
        }

    }

    private static void printInfo(Cat[] cats) {

        for (Cat cat : cats) {
            cat.printInfo();
        }

    }

    private static void fillPlats(Plate[] plate) {
        for (Plate value : plate) {
            value.addFood((int) (Math.random() * 10) + 3);
        }
    }

    private static Plate[] createArrPlats() {
        Plate plate = new Plate(10);
        Plate plate1 = new Plate(10);
        Plate plate2 = new Plate(10);

        return new Plate[]{plate, plate1, plate2};

    }

    public static Cat[] createArrCats() {

        Cat cat = new Cat("Борис Николаевич", 3);
        Cat cat1 = new Cat("Барсик", 4);
        Cat cat2 = new Cat("Мурзик", 5);
        Cat cat3 = new Cat("Мурка", 2);
        Cat cat4 = new Cat("Бандит", 6);

        return new Cat[]{cat, cat1, cat2, cat3, cat4};

    }
}