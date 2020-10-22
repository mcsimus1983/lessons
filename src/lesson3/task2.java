package lesson3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        final int NUM_HIDDEN_CHAR = 15;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner sc = new Scanner(System.in);
        String answer = words[(int)(Math.random()* words.length)];
        String userAnswer;
        int numAttempts = 1;
        System.out.println("----------------------");
        System.out.println("- Игра угадай слово. -");
        System.out.println("----------------------");

        do {
            System.out.println("Для выхода введите q");
            System.out.print("Ваш ответ: ");
            userAnswer = sc.next().toLowerCase();
            if (userAnswer.equals(answer)){
                System.out.println("Поздравляю! Вы угадали слово. Количество попыток: " + numAttempts);
                break;
            }
            StringBuilder hiddenWord = new StringBuilder();

            for (int i = 0; i < NUM_HIDDEN_CHAR; i++) {

                if (answer.length() > i && userAnswer.length()> i)
                    if (userAnswer.charAt(i) == answer.charAt(i)) {
                        hiddenWord.append(answer.charAt(i));
                        continue;
                    }
                hiddenWord.append("#");
            }
            System.out.println("Загаданное слово: " + hiddenWord);
            numAttempts++;
        }while (!userAnswer.equals("q"));
        sc.close();
        System.out.println("Игра окончена!");
    }
}
