package lesson2.homework;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

        int [] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (mass[i]==1)?(0):(1);
        }

        System.out.println(Arrays.toString(mass));

    }

}
