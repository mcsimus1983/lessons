package lesson2.homework;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {

        int[] mass = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(Arrays.toString(mass));
        offset(mass,3);
        System.out.println(Arrays.toString(mass));

    }
    public static void offset(int [] mass, int n){
        int buff;

        for (int i = 1; i <= Math.abs(n); i++) {
            if ( n > 0 ) {
                buff = mass[mass.length-1];
                mass[mass.length-1] = mass[0];
                mass[0] = buff;
            }else {
                buff = mass[0];
                mass[0] = mass[mass.length-1];
                mass[mass.length-1] = buff;
            }
        }
    }
}
