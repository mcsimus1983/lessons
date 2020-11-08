package lesson7.hw;

public class Owner {

    private Cat[] arrCats;
    private Plate[] plats;

    public Owner() {
        arrCats = createArrCats();
        plats = createArrPlats();

    }

    public void kisKis() {

        fillPlats(plats);

        printInfo(plats);
        startFeeding(arrCats, plats);
        printInfo(arrCats);
        printInfo(plats);
    }

    private void startFeeding(Cat[] arrCats, Plate[] plats) {

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

    private void printInfo(Plate[] plate) {
        for (Plate value : plate) {
            value.printInfo();
        }

    }

    private void printInfo(Cat[] cats) {

        for (Cat cat : cats) {
            cat.printInfo();
        }

    }

    private void fillPlats(Plate[] plate) {
        for (Plate value : plate) {
            value.addFood((int) (Math.random() * 10) + 3);
        }
    }

    private Plate[] createArrPlats() {
        Plate plate = new Plate(10);
        Plate plate1 = new Plate(10);
        Plate plate2 = new Plate(10);

        return new Plate[]{plate, plate1, plate2};

    }

    public Cat[] createArrCats() {

        Cat cat = new Cat("Борис Николаевич", 3);
        Cat cat1 = new Cat("Барсик", 4);
        Cat cat2 = new Cat("Мурзик", 5);
        Cat cat3 = new Cat("Мурка", 2);
        Cat cat4 = new Cat("Бандит", 6);

        return new Cat[]{cat, cat1, cat2, cat3, cat4};

    }

}
