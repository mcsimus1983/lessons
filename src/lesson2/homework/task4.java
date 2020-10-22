package lesson2.homework;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {

        int arrayLength = 10;
        int[][] mass = new int[arrayLength][arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (i == j) {
                    mass[i][j] = 1;
                    break;
                }
            }
        }

        for (int[] z : mass){

            System.out.println(Arrays.toString(z));
        }
    }
}
