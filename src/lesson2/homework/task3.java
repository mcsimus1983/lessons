package lesson2.homework;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {

        int [] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6) {
                mass[i] = mass[i] * 2;
            }
        }

        System.out.println(Arrays.toString(mass));

    }
}
