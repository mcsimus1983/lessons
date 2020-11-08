package lesson1.homework;

public class Task3 {

    public static void main(String[] args) {

        System.out.println(evaluateExpression(2, 2, 2, 3));
    }

    private static int evaluateExpression(int a, int b, int c, int d) {

        if (d == 0) {
            System.out.println("На ноль делить нельзя!");
            return 0;
        }

        return (int)(a * (b + (1.0* c / d)));
    }

}
