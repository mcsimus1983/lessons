package lesson1;

public class Main {

    public static void main(String[] args) {

/*      printHelloWorld();
        printHelloWorld();
        printHelloWorld(); */

//        testVars();

/*        calculateSalaryAfterTax(50000, 13);
        calculateSalaryAfterTax(100000, 13);
        calculateSalaryAfterTax(500000, 15 );

        System.out.println(calculateSum(3, 5));*/

//        testChars();

        checkAppraisal(3);
        testString();

        testInc();
    }

    private static void testInc() {
        int c = 0;

        c = c + 1; //1
        c += 1; //2
        c /= 2; //1
        c -= 1; //0

        System.out.println(c++); // c=0 sout(0) + 1
        System.out.println(++c); // c=1 c+1  sout(2)
        System.out.println(c--); // c=2 sout(2) - 1
        System.out.println(--c); // c=1 c-1 sout(0)
        System.out.println(c);   // c=0 sout(0)

        int a = 1;
        System.out.println(a++ + 3 * 2 );
    }

    static void printHelloWorld() {
        System.out.println("Hello, world!");
    }

    static void testVars() {
        int valA;
        valA = 7;
        int valB = 3;
        double result = 1.0 * valA / valB;
        System.out.println(result);

        double doubleA = 7.0;
        double doubleB = 3.0;
        double doubleResult = doubleA / doubleB;
        System.out.println(doubleResult);
    }

    static void testChars() {
        for (int i = 0; i < 10000; i = i + 1) {
            System.out.printf("Символ под номером %d : %c%n", i, i);
        }
    }

    static void calculateSalaryAfterTax(int salary, int tax) {
        int result = (int) (salary - salary * tax / 100.0);
        System.out.println(result);
    }

    static int calculateSum(int a, int b) {
        return a + b;
    }

    static void checkAppraisal(int appraisal) {
        boolean isTrue = true;
        if (appraisal == 5) {
            System.out.println("Молодец!");
        }
        else if(appraisal == 4) {
            System.out.println("Хорошо, но ты можешь лучше");
        }
        else if (appraisal >= 1 && appraisal <= 3){
            System.out.println("Готовь уроки лучше!");
        }
        else {
            System.out.println("Оценка неверна!");
        }
    }


    static void testString() {
        String str = "Hello ";
        String strWorld = "World";
        System.out.println(str + strWorld + 4 + 7.0);
        System.out.println(str + strWorld + (4 + 7.0));
    }

}
