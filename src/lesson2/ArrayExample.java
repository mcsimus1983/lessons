package lesson2;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        final int SIZE = 5;

        int[] data =  new int[SIZE];

        data[2] = 5;
        data[3] = 4;
        data[4] = 3;

/*        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }*/

/*        for (int datum : data) {
            System.out.println(datum);
        }*/

//        System.out.println(Arrays.toString(data));

        int[][] deepArray = new int[SIZE][SIZE];
        int num = 1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                deepArray[i][j] = num++;
            }
        }

        for (int[] ints : deepArray) {
            for (int anInt : ints) {
                System.out.printf("%2d ", anInt);
            }
            System.out.println();
        }


    }
}
