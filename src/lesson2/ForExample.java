package lesson2;

public class ForExample {

    public static void main(String[] args) {

        final int LIMIT = 20;
        final int STOP_DIGIT = 13;

        /*int i = 1;
        for (; i <= LIMIT; i++) {
            System.out.println(i);
        }

        System.out.println("i : " + i);*/
        int n = 0;
        for (int i = 0; i < LIMIT; i++) {

            if (i == STOP_DIGIT) {
                break;
            }

            if (i % 2 != 0) {
                n++;
                if (n != 4) {
                    continue;
                }
                n = 0;
            }


            System.out.println(i);

        }

    }

}
