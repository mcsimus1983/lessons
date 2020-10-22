package lesson2.homework;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {

        int[] mass = {1,1,1,2,1,1,1,2};
        if (checkBalance(mass)){
            System.out.println("В массиве есть место");

        } else {
            System.out.println("В массиве нет места");
        }

    }

    public static boolean checkBalance(int [] mass) {

        int sumJ = sumArray(mass);

        int sumI = 0;
        for (int i = 0; i < mass.length && sumJ >= sumI ; i++) {

            sumI = sumI + mass[i];
            sumJ = sumJ - mass[i];
            if (sumI==sumJ){
                return true;
            }
        }
        return false;
    }
    public static int sumArray(int [] Array){

        int sumJ = 0;
        for (int j : Array) {
            sumJ += j;
        }
        return sumJ;
    }
}
