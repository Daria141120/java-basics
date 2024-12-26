package lab4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//Test first half lab4

        HalfOne.printOddNumb();
        HalfOne.printNumbDev35();

        System.out.println("Результат: " + HalfOne.isSumEqual());
        System.out.println("Результат: " + HalfOne.isNumbMore());

        int[] massive = {1, 2, 3, 1, 3};
        System.out.println("array = " + Arrays.toString(massive));
        System.out.println("3 - первое или последнее число массива? - " + HalfOne.is3FirstOrLast(massive));

        int[] massive2 = {6, 5, 6, 7, 1, 8};
        System.out.println("array = " + Arrays.toString(massive2));
        System.out.println("Массив содержит 1 или 3? - " + HalfOne.isOneOrThreeInMass(massive2));


//Test second half lab4

        int[] massive3 = {5, 1, 6, 7};
        System.out.println(Arrays.toString(massive3));
        if (HalfTwo.isSort(massive3)) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }

        int[] massive4 = {1, 1, 6, 7, 7};
        System.out.println(Arrays.toString(massive4));
        if (HalfTwo.isSort(massive4)) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }

        HalfTwo.readOutMassive();

        int [] massive5 = {5,1,6,5,4,77,7};
        System.out.println("Array 1: " + Arrays.toString(massive5));
        System.out.println("Array 2: " + Arrays.toString(HalfTwo.exchangeFirstLast(massive5)));


        int [] massive6 = {5,1,6,5,4,17,88,1,6,4,0};
        System.out.println(Arrays.toString(massive6));
        int index = HalfTwo.searchIndexFirstUnique(massive6);
        if (index == -1) {
            System.out.println("Нет уникальных элементов");
        } else {
            System.out.println("Первый уникальный элемент = "+massive6[index]);
        }

    }
}
