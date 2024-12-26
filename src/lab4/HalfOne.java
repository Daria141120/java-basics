package lab4;

import java.util.Scanner;

public class HalfOne {
    //task 1.1
    public static void printOddNumb() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //task 1.2
    public static void printNumbDev35() {
        System.out.print("\nДелится на 3:  ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nДелится на 5:  ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nДелится на 3 и на 5:  ");
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //task 1.3
    public static boolean isSumEqual() {
        int a;
        int b;
        int res;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        res = scanner.nextInt();

        return a + b == res;
    }

    //task 1.4
    public static boolean isNumbMore(){
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        c  = scanner.nextInt();

        return (a < b) && (b < c);
    }

    //task 1.5
    public static boolean is3FirstOrLast(int [] array){
        if (array.length < 2){
            System.out.println("Длина массива должна быть больше или равна двум");
            return false;
        }

        return (array[0] == 3) || (array[array.length - 1] == 3);
    }

    //task 1.6
    public static boolean isOneOrThreeInMass(int [] array){
        for (int j : array){
            if ((j == 1) || (j == 3)){
                return true;
            }
        }

        return false;
    }

}
