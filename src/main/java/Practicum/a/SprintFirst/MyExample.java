package Practicum.a.SprintFirst;

class Mains {
    public static void main(String[] args) {
    }
}

class Converter {
    double rateUSD = 78.5;//доллар = 78.5;
    double rateEUR = 88.7;///евро = 88.7;
    double rateJPY = 0.75; //иена = 0.75;

    public Converter(double usd, double eur,  double jpy) {
        this.rateUSD = usd;
        this.rateEUR = eur;
        this.rateJPY = jpy;
    }

    void convert(double rubles, int currency){

        // Тело метода
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + rubles / rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}




