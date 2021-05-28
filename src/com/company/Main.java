package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //Task18  Создайте переменную для массива из 10 элементов.заполните его произвольными значениями,
        // целочисленного типа и выведите последний элемент массива на экран.


        int[] variable = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int y = 0; y < variable.length; y++) {
            if (variable[y] == variable.length) {
                System.out.println(variable[y]);
            }

        }

        //Task19  создайте переменную для массива из 10 элементов.Выведете элементы стоящие на четных позициях


        int[] arrayInt = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenPosition = arrayInt[0];
        for (int e = 0; e < arrayInt.length; e++) {

            if (arrayInt[e] % 2 != 0) {
                evenPosition = arrayInt[e];
                System.out.print(evenPosition);
            }

        }


        //Task20 переменную для массива из 10 элементов.Заполните его произвольными знач.int.
        // Найдите максимальный элемент и выведите  его индекс.


        int[] array = {1, 50, 7, 8, 109, 99, 44, 104, 66, 77};

        int maxElement = array[0];//создаем переменную и присваеваем индекс масива [0]
        int indMaxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                indMaxElement = i;
            }
        }
        for (int t = indMaxElement; t < array.length; t++) {
        }
        System.out.println(indMaxElement);


    }
}





