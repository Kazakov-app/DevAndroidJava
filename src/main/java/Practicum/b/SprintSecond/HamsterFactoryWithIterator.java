package Practicum.b.SprintSecond;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

class Practicum {

    public static void main(String[] args) {
        HamsterFactory hamsterFactory = new HamsterFactory();
        hamsterFactory.start();
    }
}

class HamsterFactory {
    Scanner scanner = new Scanner(System.in);

    // нужна структура данных, в которой можно хранить только уникальных хомяков
    HashSet<Hamster> hamstersSet = new HashSet<>();

    public void start() {
        System.out.println("Добро пожаловать на фабрику хомяков!");
        System.out.println("Здесь вы можете создавать, удалять и даже печатать хомяков");
        System.out.println("Для работы с фабрикой используйте следующие команды:");
        System.out.println("'Печать' — показать всех хомяков в хранилище");
        System.out.println("'Создать [Имя]' — создать хомяка с выбранным именем");
        System.out.println("'Удалить [Имя]' — удалить хомяка с выбранным именем");
        System.out.println("'Очистить' — удалить всех, ранее созданных хомяков");
        System.out.println("'Размер' — вывести на экран текущее количество хомяков в хранилище");
        System.out.println("'Завершить' — завершить работу программы");

        while (true) {
            System.out.println("Введите команду...");

            String command = scanner.nextLine();
            if (command.equals("Завершить")) {
                System.out.println("Программа завершена! Спасибо, что пользуетесь нашей сетью хомячих фабрик");
                break;
            } else {
                executeCommand(command);
            }
        }
    }
    private void executeCommand(String command) {
        if (command.startsWith("Создать ")) {
            executeCreate(command.substring("Создать ".length()));
        } else if (command.startsWith("Удалить ")) {
            executeRemoveByName(command.substring("Удалить ".length()));
        } else if (command.equals("Печать")) {
            executePrint();
        } else if (command.equals("Очистить")) {
            executeClear();
        } else if (command.equals("Размер")) {
            executeSize();
        } else {
            showErrorMessage();
        }
    }

    private void executePrint() {
        // выведите сообщение: "Вывожу актуальный список хомяков в хранилище:"
        // напечатайте всех хомяков, которые есть в хранилище в формате "Хомяк '[Имя хомяка]'"
        System.out.println("Вывожу актуальный список хомяков в хранилище:");
        for (Hamster hamsters : hamstersSet ) {
            System.out.println("Хомяк '" + hamsters.name + "'");
        }
    }

    private void executeCreate(String name) {
        // создайте хомяка с именем [name] и добавьте его в ваше хранилище
        // если такой хомяк уже есть в хранилище, выведите: "Хомяк '[name]' уже находится в хранилище"
        // иначе выведите сообщение: "Хомяк '[name]' создан и добавлен в хранилище"
        Hamster newHamster = new Hamster(name);

        if (hamstersSet.contains(newHamster)) {
            System.out.println("Хомяк '" + name + "' уже находится в хранилище");
        } else {
            hamstersSet.add(newHamster);
            System.out.println("Хомяк '" + name + "' создан и добавлен в хранилище");
        }
    }

    private void executeRemoveByName(String name) {
        // если хомяк существует, то нужно удалить его и вывести сообщение: "Хомяк '[Имя удаленного хомяка]' удалён успешно"
        // иначе вывести сообщение: "Хомяка с именем '[Имя]' не существует"
        Hamster hamsterToRemove = new Hamster(name);

        if (hamstersSet.equals(hamsterToRemove)) {
            hamstersSet.remove(hamsterToRemove);
            System.out.println("Хомяк '" + name + "' удалён успешно");
        } else {
            System.out.println("Хомяка с именем '" + name + "' не существует");
        }
    }

    private void executeClear() {
        // нужно удалить всех хомяков, которые есть в хранилище
        // каждый удаленный хомяк должен сопровождаться сообщением "Хомяк '[Имя удаленного хомяка]' удалён успешно"
        // после завершения очистки напечатайте "Операция очистки завершена успешно! Все хомяки были удалены из хранилища"
        Iterator<Hamster> iterator = hamstersSet.iterator();
        while (iterator.hasNext()) {
            Hamster hamster = iterator.next();
            System.out.println("Хомяк '" + hamster.name + "' удалён успешно");
            iterator.remove();
        }
        System.out.println("Операция очистки завершена успешно! Все хомяки были удалены из хранилища");
    }

    private void executeSize() {
        // если в хранилище есть хомяки, нужно вывести сообщение: "Количество хомяков в хранилище равно [текущее количество хомяков в хранилище]"
        // иначе вывести: "В хранилище нет хомяков"
        if (hamstersSet.isEmpty()) {
            System.out.println("В хранилище нет хомяков");
        } else {
            System.out.println("Количество хомяков в хранилище равно " + hamstersSet.size());
        }
    }

    // этот метод мы реализовывали в прошлой фабрике, оставим без изменений
    private void showErrorMessage() {
        System.out.println("Неверная команда, попробуйте еще раз.");
    }
}

class Hamster {

    String name;

    public Hamster(String name) {
        this.name = name;
    }

    // Функция boolean equals(Object object) определяет, равен ли один объект другому.
    // Функция int hashCode() возвращает хеш-код, связанный с вызывающим объектом.
    // Эти функции нужны для корректной работы HashSet, подробнее о них поговорим в одной из следующих тем спринта

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamster hamster = (Hamster) o;
        return name.equals(hamster.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
