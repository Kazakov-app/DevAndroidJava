package Practicum.b.SprintSecond;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SmallGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int randomInt = new Random().nextInt(10); // Генерирует новое число от 0 до 9
            int userInput; // Это нужно, чтобы цикл запустился, если Random выдаст 0
            int count = 0;
            System.out.println("Я загадал число от 0 до 9.");
            System.out.println("Ваш ход:");

            // Условие цикла для запуска игры
            while (true) {
                userInput = scanner.nextInt(); // В этой переменной должен сохраняться ввод пользователя
                count++;
                if (userInput > randomInt) { // Условие проверяется в цикле
                    if (count % 3 == 0) {
                        System.out.println("Вы, не угадали, сыграйте еще раз?\nCыграем еще раз? 1-Да, 0-Нет");
                        break;
                    }
                    System.out.println("Меньше");

                } else if (userInput < randomInt) {
                    if (count % 3 == 0) {
                    System.out.println("Вы, не угадали, сыграйте еще раз.\nCыграем еще раз? 1-Да, 0-Нет");
                    break;
                }
                    // Второе условие
                    System.out.println("Больше");
                } else if (userInput == randomInt) {
                    // Печатаем, когда число угадано
                    System.out.println("Вы великолепны! Именно это я и загадал.\nCыграем еще раз? 1-Да, 0-Нет");
                    break;
                }/*
                while (true) {
                    if (userInput == 1) {
                        System.out.println("Еще играем");
                        break;
                    } else if (userInput == 0) {
                        System.out.println("Пока");
                        break;
                    }
                }
                */
            }

        }
    }
}



