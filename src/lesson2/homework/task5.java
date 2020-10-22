package lesson2.homework;

public class task5 {
    public static void main(String[] args) {

        int [] mass = {5, 15, -1, 44, 8, 13, 99, 32, 42, 9};
        int max = mass[0];
        int min = mass[0];

        for (int i = 1; i < mass.length; i++) {
            if (max<mass[i]){
                max= mass[i];
            }
            if (min>mass[i]){
                min = mass[i];
            }
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное  число: " + min);

    }
}
