package com.company;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {




        //Task18  Создайте переменную для массива из 10 элементов.заполните его произвольными значениями,
        // целочисленного типа и выведите последний элемент массива на экран.


        int[] variable = {1, 2, 3, 4, 5, 6, 7, 8, 9, 40};
        int bv=variable[0];
        for (int y = 0; y < variable.length; y++) {
            int lastElement=variable[y];
            if (y==variable.length-1){

            }
        }
        //ArrayUtils.printArray(variable);



        //Task19  создайте переменную  для массива из 10 элементов.Выведете элементы стоящие на четных позициях


        int[] arrayInt = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenPosition = arrayInt[0];
        for (int e = 0; e < arrayInt.length; e++) {

            if (arrayInt[e] % 2 != 0) {
                evenPosition = arrayInt[e];
            }

        }
        //ArrayUtils.printArray(arrayInt);

        //Task20 переменную для массива из 10 элементов.Заполните его произвольными знач.int.
        // Найдите максимальный элемент и выведите  его индекс.


        int[] array = {1, 50, 7, 8, 109, 99, 44, 104, 66, 77};

        int maxElement = array[0];//создаем переменную и присваеваем индекс масива [0]
        int indMaxElement = 0;
        for (int p = 0; p < array.length; p++) {
            if (array[p] > maxElement) {
                maxElement = array[p];
                indMaxElement = p;
            }
        }
        for (int t = indMaxElement; t < array.length; t++) {
        }
        // System.out.println(indMaxElement);




        // Task21 создайте переменную для массива из 10 элементов.Заполните его произвольными
        // значениями целочисленного типа.Определите сумму элементов массива,расположенных между
        //минимальным и максимальным значениями.Если значений макс.и мин. несколько,то необходимо
        // взять максимальное значение разницы индексов  между макс. и мин.  значениями.


        int[] arrayRandom = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//должно получится 44 ,без первым и последним

        int sum = 0;
        int maxValue = 0;
        int minValue = 100;
        int sumTemp = 0;

        for (int u = 0; u < arrayRandom.length; u++) {

            if (maxValue < arrayRandom[u]) {
                maxValue = arrayRandom[u];
            }
            if (minValue > arrayRandom[u]) {
                minValue = arrayRandom[u];
            }

            sumTemp += arrayRandom[u];
            sum = sumTemp - minValue - maxValue;

        }

         //System.out.println(sum);





        //Task22 создайте переменную для массива из 10 элементов.Заполните его произвольными
        // значениями целочисленного типа.Выведите на экран,переверните и снова вывдите.(без создания другого массива)

        int[] arrayRevers = {1, 2, 3, 4, 5, 15, 7, 8, 13, 10};
        int revers;

        for (int e = 0; e < arrayRevers.length; e++) {

           // System.out.print(arrayRevers[e] + " ");
        }

        for (int w = arrayRevers.length - 1; w >= 0; w--) {
            revers = arrayRevers[w];

              //System.out.print(" " + revers);
        }



        //Task23 создать двухмерный массив и заполнить его бабочкой


        int[][] arrayBat = new int[5][5];
        int i, m;
//2 цикла с условием ,которые будут выполняться с начала
        for (i = 0; i < arrayBat.length / 2 + 1; i++) {//Если(5/2+1=3.5) i<3.5; i++(3итерации)
            for (m = 0; m < arrayBat[i].length; m++) {//если m<5;m++ (5итераций)
                if ((m < i) || (m >= (arrayBat[i].length - i))) {//если m меньше i или больше и ровно 5-i
                    arrayBat[i][m] = 0;
                } else {
                    arrayBat[i][m] = 1;

                }
            }
        }
//2 цикла с условием ,которые будут выполняться с конца
        for (i = arrayBat.length - 1; i >= arrayBat.length / 2 + 1; i--) {
            for (m = 0; m < arrayBat[i].length; m++) {
                if ((m < (arrayBat[i].length - 1 - i)) || (m > i)) {

                    arrayBat[i][m] = 0;
                } else {
                    arrayBat[i][m] = 1;
                }
            }
        }

//2 цикла для отступов и вывода
        for (i = 0; i < arrayBat.length; i++) {
            for (m = 0; m < arrayBat[i].length; m++) {
             //   System.out.print(arrayBat[i][m]);
            }
           // System.out.println();
        }


    }
}







