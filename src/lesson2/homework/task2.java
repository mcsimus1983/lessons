package lesson2.homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int [] mass = new int[8];

        for (int i = 0; i < mass.length; i++) {

            mass[i] = i * 3;

        }

        System.out.println(Arrays.toString(mass));
    }
}
