package Practicum.c.SprintThird;

public class Practicum {
    public static void main(String[] args) {
        DriftCar driftCar = new DriftCar(true, 2);
        Car car = new Car(false, 5);
        Bike bike = new Bike();

        Driver driver = new Driver();
        driver.drive(bike);
        driver.drive(car);
        driver.drive(driftCar);
    }
}

class Vehicle {
    int doorsCount;
    boolean isBenzine;

    Vehicle(boolean isBenzine, int doorsCount) {
        this.isBenzine = isBenzine;
        this.doorsCount = doorsCount;
    }

    void drive() {
        System.out.println("Врум-врум");
    }
}

class Car extends Vehicle {
    Car(boolean isBenzine, int doorsCount) {
        super(isBenzine, doorsCount);
    }
}

class DriftCar extends Car {
    DriftCar(boolean isBenzine, int doorsCount) {
        super(isBenzine, doorsCount);
    }

    void drift() {
        System.out.println("Еду боком!");
    }
}

class Bike extends Vehicle {
    Bike() {
        super(true, 0);
    }

    void rideOnBackWheel() {
        System.out.println("Еду на заднем колесе!");
    }
}

// создайте класс Driver
// создайте метод drive, принимающий в качестве аргумента экземпляр класса Vehicle
// в зависимости от переданного класса, вызовите методы этого класса
class Driver{
    public void drive(Vehicle vehicle){
        if(vehicle instanceof DriftCar){
            ((DriftCar)vehicle).drift();
        } else if (vehicle instanceof Bike){
            ((Bike)vehicle).rideOnBackWheel();
        } else{
            vehicle.drive();
        }
    }
}
/*public void closeAccount(BankAccount account) {
        if (account instanceof DebitAccount) {
            if (account.amount == 0) {
                System.out.println("Ваш дебетовый счёт закрыт");
            } else {
                System.out.println("Ваш дебетовый счёт закрыт. Вы можете получить остаток по вашему счёту в размере " + account.amount + " " + account.currency + " в отделении банка");
            }
        } else if (account instanceof CreditAccount) {
            CreditAccount creditAccount = (CreditAccount) account;
            if (creditAccount.amount == 0) {
                System.out.println("Ваш кредитный счёт закрыт");
            } else if (creditAccount.amount > 0) {
                System.out.println("Ваш кредитный счёт закрыт. Вы можете получить остаток по вашему счёту в размере " + creditAccount.amount + " " + creditAccount.currency + " в отделении банка");
            } else {
                System.out.println("Вы не можете закрыть кредитный счёт потому как на нем еще есть задолженность. Ваша задолженность по счету составляет " + Math.abs(creditAccount.amount) + " " + creditAccount.currency);
            }
        } else {
            System.out.println("Пока что мы не можем закрыть данный вид счёта");
        }
    }
}*/