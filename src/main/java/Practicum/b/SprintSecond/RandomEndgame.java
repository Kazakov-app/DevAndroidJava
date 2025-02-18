package Practicum.b.SprintSecond;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomEndgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        while (true) {

            int randomInt = new Random().nextInt(10);
            System.out.println("Я загадал число от 0 до 9.");
            System.out.println("Ваш ход:");

            for (int i = 1; i <= 3; i++) {
                try {
                    userInput = scanner.nextInt();
                    if (userInput > randomInt) {
                        if (i % 3 == 0) {
                            System.out.println("Вы, не угадали, сыграем еще раз? 1-Да, 0-Нет");
                            break;
                        }
                        System.out.println("Меньше");
                    } else if (userInput < randomInt) {
                        // Второе условие
                        if (i % 3 == 0) {
                            System.out.println("Вы, не угадали, сыграем еще раз? 1-Да, 0-Нет");
                            break;
                        }
                        System.out.println("Больше");
                    } else if (userInput == randomInt) {
                        // Печатаем, когда число угадано
                        System.out.println("Вы великолепны! Именно это я и загадал.\nCыграем еще раз? 1-Да, 0-Нет");
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Неправильный формат. Введите целое число от 0 до 9.");
                    scanner.nextLine();
                }
            }

            while (true) {
                try {
                userInput = scanner.nextInt();

                if (userInput == 0 || userInput == 1) {
                    break; // Выход из цикла, если введено корректное значение
                } else {
                    System.out.println("Пожалуйста, введите 1 для продолжения или 0 для выхода.");
                    userInput = scanner.nextInt();
                }
                } catch (InputMismatchException e) {
                    System.out.println("Неправильный формат ввода.\n"
                            +"Пожалуйста, введите 1 для продолжения или 0 для выхода.");
                    scanner.nextLine();
                }
            }
            if (userInput == 1) {
                System.out.println("Еще играем");
            } else if (userInput == 0) {
                System.out.println("Пока");
                break;
            }
        }
    }
}







