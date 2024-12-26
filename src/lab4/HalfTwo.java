package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class HalfTwo {
    //task 2.1
    public static boolean isSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
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

        int[] array = new int[lengthMassive];
        System.out.println("Numbers of array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Result: "+Arrays.toString(array));
    }

    //task 2.3
    public static int [] exchangeFirstLast(int [] array){
        int [] newArray = array.clone();

        int temp;
        temp = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = temp;

        return newArray;
    }

    //task 2.4
    public static int searchIndexFirstUnique(int[] array) {
        boolean flagNotFound = true;
        for (int i = 0; i < array.length; i++, flagNotFound = true) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                if (array[i] == array[j]) {
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
