package lesson1.homework;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(test(5, 2));
        System.out.println(test(5, 5));
        System.out.println(test(5, 10));
        System.out.println(test(5, 15));
        System.out.println(test(5, 16));
    }


    public static boolean test (int a, int b){
      return a + b >= 10 && a + b <= 20;
    }
}
