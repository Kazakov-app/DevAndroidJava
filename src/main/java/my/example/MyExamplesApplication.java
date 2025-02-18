package my.example;

import java.util.Scanner;

class StringFormatDemo {
     public static void main(String[] args) {
         float usdToRub = 113.78f;
         float eurToRub = 125.31f;

         int amount = 75;

         float eurToUsd = eurToRub / usdToRub;
         float result = amount * eurToUsd;

         String format = "Курс Евро к Доллару: %.2f.\n%d Евро это %.2f Долларов.";  //

         System.out.println(String.format(format, eurToUsd, amount, result));


//Импровизированная линия
        for(int k=1;k<=20;k++){
            String txt="_";
            System.out.print(txt);
        }
    }
}

class CallMethodsDemo {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v2.0.");
        // Вызовите ниже методы в правильном порядке (как указано в условиях задачи)
        sayHello();
        goodDay();
        welcomeUserByName();
        printSuccess();

    }

    public static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.next();
        printCity();
        String city = scanner.next();

        // Спросите пользователя, из какого он города, используя метод printCity()
        // Создайте и проинициализируйте строковую переменную String city при помощи объекта scanner аналогично тому, как проинициализирована переменная name выше

        System.out.println("Рад познакомиться, " + name + " из " + city + "!");
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }

    // Напишите метод sayHello(), который печатает: "Привет!"
    public static void sayHello() {
        System.out.println("Привет!");
    }

    // Напишите метод goodDay(), который выводит строку: "Хорошего дня!"
    public static void goodDay() {
        System.out.println("Хорошего дня!");
    }
    // Напишите метод printCity(), который спрашивает: "Из какого вы города?"
    public static void printCity(){
        System.out.println("Из какого вы города?");
    }
}
class MaxNumberDemo {

    public static void main(String[] args) {
        System.out.println("Наибольшее из чисел 3 и 5 = " + findMax(3,5));
        // Напишите аналогичный вызов метода findMax для таких пар чисел: 16 и 5, -1 и -7
        System.out.println("Наибольшее из чисел 16 и 5 = " + findMax(16,5));
        System.out.println("Наибольшее из чисел -1 и -7 = " + findMax(-1,-7));

    }

    public static int findMax(int a,int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

}

class Examples {
    public static void main(String[] args) {
        /*String message = " Veni, vidi, vici!   ";
        int messageL=message.length();
        String messageT=message.trim();
        int messageTL=messageT.length();
        System.out.println(messageL-messageTL);

         */

        int a = 2, b = 1, c = 3;
        if (a <= (c - b)) {
            a = c + b; //3+1=4
        } else if (c > b) {
            a = a * b;
        }
        if (a > c) // тут а=4, уже больше 3
            b = a / 2; //b=2
        c = a * b; // тут 8
        System.out.println(a + b + c);
                            //4+2+8
    }
}


