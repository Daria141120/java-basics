package lab1;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        System.out.println("Я\nхорошо\nзнаю\nJava.");
        System.out.println();

        task2Calculation();

        task3Division();

        task4Multiplication();

        task5ReabOut();

        task6EvenOddNumber();
    }

    public static void task2Calculation() {
        double resultDouble = (46 + 10) * ((double) 10 / 3);
        System.out.println(resultDouble);
        int resultInt = 29 * 4 * -15;
        System.out.println(resultInt);
    }

    public static void task3Division() {
        int number = 10500;
        int result = (number / 10) / 10;
        System.out.println(result);
    }

    public static void task4Multiplication() {
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;

        double result = a * b * c;
        System.out.println(result);
    }

    public static void task5ReabOut() {
        int readNumb1, readNumb2, readNumb3;

        System.out.println("Введите три целых числа: ");

        Scanner scanner = new Scanner(System.in);
        readNumb1 = scanner.nextInt();
        readNumb2 = scanner.nextInt();
        readNumb3 = scanner.nextInt();

        System.out.println(readNumb1);
        System.out.println(readNumb2);
        System.out.println(readNumb3);
    }

    public static void task6EvenOddNumber() {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();

        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }
    }
}