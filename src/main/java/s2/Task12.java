package s2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Введите расстояние пути:");
        double km = requestNum();
        System.out.println("Введите расход топлива автомобиля на 100км: ");
        double liter = requestNum();
        System.out.println("Введите стоимость одного литра топлива: ");
        double price = requestNum();

        System.out.println("Расстояние: " + km);
        System.out.println("Расход топлива 100км: " + liter);
        System.out.println("Цена за 1л: " + price);

        double priceOneKm = liter /100 * price;
        double resultPriceKm = km * priceOneKm;
        System.out.println("Стоимость топлива за поездку " + km + "км будет равна: " + resultPriceKm);

        double fuelSpent = liter / 100 * km;
        System.out.println("Количество топлива за поездку " + km + "км будет равна: " + fuelSpent);
    }

    public static double requestNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
