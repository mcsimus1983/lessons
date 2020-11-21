package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//        testString();

/*        testOverload(3, 6);
        testOverload(3.5, 6.6);
        testOverload(7);
        testOverload(7,4,3,2,1);
        testOverload(4,3,2,1);*/

//        testConsoleInput();

        testRandom();
    }

    private static void testRandom() {

        Random random = new Random();

        int[] data = new int[30];

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(11); //0 - 10
            data[i] = random.nextInt(8) + 3; //3 - 10
            data[i] = random.nextInt(12) - 5; // -5 - 6

            data[i] = (int)(Math.random() * 10); //0 - 9
            data[i] = (int)(Math.random() * 10) + 1; //1 - 10
            data[i] = (int)(Math.random() * 12) - 5; //-5 - 6
        }

        System.out.println(Arrays.toString(data));

    }

    private static void testConsoleInput() {

/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name ;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            System.out.println("ВСЕ ПРОПАЛО!");
            e.printStackTrace();
        }
        System.out.println("Hello, " + name);*/


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение А: ");
        int a = scanner.hasNextInt() ? scanner.nextInt() : 0;

        System.out.print("\nВведите значение Б: ");
        int b = scanner.hasNextInt() ? scanner.nextInt() : 0;

        int a2 = Integer.parseInt("11");

        testOverload(a2);
        testOverload(a, b);


    }

    private static int testOverload(int a, int b) {
        int multiple = a * b;
        System.out.printf("%d * %d = %d(int)%n", a, b, multiple);
        return multiple;
    }

    private static double testOverload(double a, double b) {
        double multiple = a * b;
        System.out.printf("%.2f * %.2f = %f(double)%n", a, b, multiple);
        return multiple;
    }

    private static int testOverload(int a) {
        int multiple = a * a;
        System.out.printf("%d * %d = %d(квадрат)%n", a, a, multiple);
        return multiple;
    }

    private static int testOverload(int... a) {
        int multiple = 1;
        for (int i : a) {
            multiple *= i;
        }

        System.out.println("Произведение всех чисел: " + multiple);
        return multiple;
    }


    private static void testString() {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str2 == str3: " + (str2 == str3));
        System.out.println("str2 == str3 equals: " + (str2.equals(str3)));

        str1 = "Hello world!";

        int[] arr = {3,3,3,3,3};
        System.out.println(str1);
    }
}
