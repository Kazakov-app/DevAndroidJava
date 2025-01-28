package Practicum;
import java.util.Random;
import java.util.Scanner;
class PracticumDemo {

        public static void main(String[] args) {
            int money = 500; // Деньги на корм
            int packPrice = 100; // Стоимость пачки корма
            int days = 0; // Дни, когда вы сможете покупать корм
            for(int i=money;money >= packPrice;i-=packPrice){
                money-=packPrice;
                days+=3;
                System.out.println("На "+days+"-й день останется "+money+" рублей.");
                // Здесь опишите цикл, начинаем с 500 рублей
                // Здесь отразите, что вы будете покупать корм каждые три дня
                // Опишите строку вывода
                // Цикл оканчивается здесь
            }
            System.out.println("Денег хватит на " + days + " дней.");
        }
}



class PracticumOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomInt = new Random().nextInt(1001); // Генерирует новое число от 0 до 1000

        int userInput = -1; // Это нужно, чтобы цикл запустился, если Random выдаст 0
        System.out.println("Я загадал число от 0 до 1000.");
        System.out.println("Ваш ход:");

        // Напишите условие цикла для запуска игры

         // В этой переменной должен сохраняться ввод пользователя
        while (userInput != randomInt) {
            userInput = scanner.nextInt();

            if (userInput > randomInt) { // Условие проверяется в цикле

                System.out.println("Меньше");

            } else if (userInput < randomInt) {

                System.out.println("Больше");
            } else {

                System.out.println("Вы великолепны! Именно это я загадал.");
            }
        }
    }
}
class PracticumTwo {

    // Объявите метод sum с двумя аргументами а и b, который будет считать сумму значений (a+b)
    public static int sum(int a, int b){
        int sum=a+b;
        return sum;
    }

    // Объявите метод subtract с двумя аргументами а и b, который будет считать разницу значений (a-b)
    public static int subtract(int a,int b){
        int subtract;
        return subtract=a-b;
    }

    // Объявите метод multiply с двумя аргументами а и b, который будет считать результат умножения двух значений (a*b)
    public static int multiply(int a, int b){
        int multiply=a*b;
        return multiply;
    }

    // Объявите метод divide с двумя аргументами а и b, который будет считать результат деления двух значений (a/b)
    public static int divide(int a, int b){
        //int divide=a*b;
        return a/b;
    }
}
class PracticumThree {
    /*// класс Scanner позволяет нам считывать пользовательский ввод в консоль
    final static Scanner scanner = new Scanner(System.in);
    public static void calculate(int a, int b) {
        // Покажите сообщение пользователю: "Введите один из предложенных операторов: '+', '-', '*', '/'"
        System.out.println("Введите один из предложенных операторов: '+', '-', '*', '/'");
        String operator = scanner.next(); // Сохраните введённое пользователем значение в строковую переменную operator. Для этого вызовите метод scanner.next()

        int result;

        // В зависимости от символа, введённого пользователем, вызвать подходящий метод и записать результат вычислений в переменную result
        // Если пользователь ввёл неверный символ — вывести сообщение "Неизвестный оператор, попробуйте ввести снова"
        // Для реализации этой логики рекомендуем использовать switch-case

        switch (operator) {
            case "+":
                result = sum(a, b);
                break;

            case "-":
                result = subtract(a,b);
                break;
            case "*":
                result = multiply(a,b);
                break;
            case "/":
                result = divide(a,b);
                break;
            default:
                System.out.println("Неизвестный оператор, попробуйте ввести снова");
                calculate(a, b);
                return;
        }


        System.out.println(a + " " + operator + " " + b + " = " + result);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}*/

    private static final Scanner scanner = new Scanner(System.in);

    // объявите метод main()
    // покажите пользователю сообщение "Введите первое значение" и, используя scanner, сохраните это значение в переменную типа int
    // покажите пользователю сообщение "Введите второе значение" и сохраните это значение в другую переменную типа int
    // вызовите метод calculate(), чтобы посчитать результат
    public static void main(String[] args) {
        System.out.println("Введите первое значение");
        int a = scanner.nextInt();
        System.out.println("Введите второе значение");
        int b = scanner.nextInt();
        calculate(a,b);

    }
    public static void calculate(int a, int b) {
        System.out.println("Введите один из предложенных операторов: '+', '-', '*', '/'");
        String operator = scanner.next();

        int result = 0;
        switch (operator) {
            case "+":
                result = sum(a, b);
                break;
            case "-" :
                result = subtract(a, b);
                break;
            case "*" :
                result = multiply(a, b);
                break;
            case "/" :
                result = divide(a, b);
                break;
            default :
                System.out.println("Неизвестный оператор, попробуйте ввести снова");
                return;
        }

        System.out.println(a + " " + operator + " " + b + " = " + result);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
class Main {

    public static void main(String[] args) {
        executeWorkingDay();
    }

    private static void executeWorkingDay() {
        timeNotification(11);
        // опять этот надоедливый будильник
        alarmWakeUp();
        // нам срочно нужен кофе
        goToKitchen();
        makeCoffee();
        stringNotice("Взять кофе и включить ноутбук");
        watchMems();
        //timeNotification(12);
        // О, на часах уже полдень, пора бы начать работать.
        // поработаем-ка мы до 8 вечера
        workTime(12);
        //timeNotification(20);
        playPsTime(20);
        timeNotification(24);
        selectFilmWithAlisa();
        goToBed();
    }

    private static void goToKitchen() {
        System.out.println("Пойти на кухню");
    }

    private static void stringNotice(String notice) {
        System.out.println(notice);
    }

    private static void timeNotification(int time) {
        switch (time){
            case 12:
                System.out.println("Время "+time+".00\nО, на часах уже полдень, пора бы начать работать.\nпоработаем-ка мы до 8 вечера");
                break;
            case 24:
                System.out.println("Кажется, пора посмотреть фильм и пойти спать");
                break;
            default:
                System.out.println("Время "+time+".00");
        }


    }

  private static void workTime(int time){
          while (time <= 20) {
              System.out.println("Писать код... Клац, клац...");
              time++;
              // неплохо бы приготовить ещё чашку кофе
              if (time % 3 == 0) {
                  makeCoffee();
                  System.out.println("Взять кофе и вернуться делать: 'клац... клац...'");
              }
          }
      }
      private static void playPsTime(int time) {
        System.out.println("Пора бы поиграть в Playstation");
        while (time <= 24) {
            System.out.println("Пиу пи");
            time++;
        }
      }
    private static void selectFilmWithAlisa() {
        System.out.println("Алиса, помоги выбрать фильм");
        while (isThisFilmInteresting()) {
            System.out.println("Алиса, не то");
        }
        System.out.println("То что нужно! Отличный фильм");
    }

    private static void goToBed() {
        System.out.println("Ну вот, пора спать :(");
    }

    private static void watchMems() {
        System.out.println("Посмотреть мемы про менеджеров за кружкой кофе"); // да, куда же без мемов?

        for (int i = 5; i >= 0; i--) {
            if (i == 0) {
                System.out.println("Кажется, пора работать");
            } else {
                System.out.println("О_о, ещё мемчик");
            }
        }
    }

    private static void makeCoffee() {

        if (isKettleEmpty()) {
            System.out.println("Налить воды в чайник");
        }
        System.out.println("Включить чайник");

        for (int i = 4; i >= 0; i--) {
            switch (i) {
                case 0:
                    System.out.println("Вода закипела");
                    break;
                case 1:
                    System.out.println("Вода закипит через минуту");
                    break;
                default:
                    System.out.println("Вода закипит через " + i + " минуты");
                    break;
            }
        }
        System.out.println("Приготовить кофе");
    }

    private static void alarmWakeUp() {
        while (true) {
            System.out.println("Будильник: БЗЗЗЗЗЗЗЫЫЫЫЫЫЫНЬ!");
            if (isProgrammerWakeUp()) {
                break;
            }
        }
    }

    // программисты любят поспать подольше
    private static boolean isProgrammerWakeUp() {
        int random = new Random().nextInt(5); // этот метод позволяет сгенерировать случайное число от 0 до 4
        return random == 0;
    }

    // воды в чайнике может и не быть :(
    private static boolean isKettleEmpty() {
        return new Random().nextBoolean(); // этот метод позволяет сгенерировать случайное значение типа boolean (true или false)
    }

    // давайте выберем интересный фильм
    private static boolean isThisFilmInteresting() {
        int random = new Random().nextInt(3); // этот метод позволяет сгенерировать случайное число от 0 до 2
        return random != 0;
    }
}


