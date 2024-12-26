package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class HalfTwo {
    //task 2.1
    public static boolean isSort(int[] massive) {
        for (int i = 0; i < massive.length - 1; i++) {
            if (massive[i] > massive[i + 1]) {
                return false;
            }
        }

        return true;
    }

    //task 2.2
    public static void readOutMassive(){
        int lengthMassive;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array length: ");
        lengthMassive = scanner.nextInt();

        int[] massive = new int[lengthMassive];
        System.out.println("Numbers of array:");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = scanner.nextInt();
        }

        System.out.println("Result: "+Arrays.toString(massive));
    }

    //task 2.3
    public static int [] exchangeFirstLast(int [] massive){
        int [] newMassive = massive.clone();

        int temp;
        temp = newMassive[0];
        newMassive[0] = newMassive[newMassive.length - 1];
        newMassive[newMassive.length - 1] = temp;

        return newMassive;
    }

    //task 2.4
    public static int searchIndexFirstUnique(int[] massive) {
        boolean flagNotFound = true;
        for (int i = 0; i < massive.length; i++, flagNotFound = true) {
            for (int j = 0; j < massive.length; j++) {
                if (i == j) {
                    continue;
                }
                if (massive[i] == massive[j]) {
                    flagNotFound = false;
                    break;
                }
            }
            if (flagNotFound) {
                return i;
            }
        }

        return -1;
    }


}
