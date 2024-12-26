package lab4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//Test first half lab4

        HalfOne.printOddNumb();
        HalfOne.printNumbDev35();

        System.out.println("Результат: " + HalfOne.isSumEqual());
        System.out.println("Результат: " + HalfOne.isNumbMore());

        int[] array = {1, 2, 3, 1, 3};
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("3 - первое или последнее число массива? - " + HalfOne.is3FirstOrLast(array));

        int[] array2 = {6, 5, 6, 7, 1, 8};
        System.out.println("array = " + Arrays.toString(array2));
        System.out.println("Массив содержит 1 или 3? - " + HalfOne.isOneOrThreeInMass(array2));


//Test second half lab4

        int[] array3 = {5, 1, 6, 7};
        System.out.println(Arrays.toString(array3));
        if (HalfTwo.isSort(array3)) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }

        int[] array4 = {1, 1, 6, 7, 7};
        System.out.println(Arrays.toString(array4));
        if (HalfTwo.isSort(array4)) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }

        HalfTwo.readOutMassive();

        int [] array5 = {5,1,6,5,4,77,7};
        System.out.println("Array 1: " + Arrays.toString(array5));
        System.out.println("Array 2: " + Arrays.toString(HalfTwo.exchangeFirstLast(array5)));


        int [] array6 = {5,1,6,5,4,17,88,1,6,4,0};
        System.out.println(Arrays.toString(array6));
        int index = HalfTwo.searchIndexFirstUnique(array6);
        if (index == -1) {
            System.out.println("Нет уникальных элементов");
        } else {
            System.out.println("Первый уникальный элемент = "+ array6[index]);
        }

    }
}
