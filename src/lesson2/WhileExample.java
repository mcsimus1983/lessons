package lesson2;

public class WhileExample {

    public static void main(String[] args) {

        final int LIMIT = 20;
        int i = 30;
        while (i < LIMIT) {
            System.out.println(i);
            i++;
        }

        i = 30;
        do {
            System.out.println(i);
            i++;
        } while (i < LIMIT);



    }

}
