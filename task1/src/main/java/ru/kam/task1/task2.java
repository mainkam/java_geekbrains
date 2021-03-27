package ru.kam.task1;

import java.util.Arrays;

/**
 * Project task1
 *
 * @Author Anton Kravtsov
 * Created 13.03.2021
 * v1.0
 */
public class task2 {


    /* Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0; */
    public void Calc21( )
    {
        int[] intArr = {0,1,1,1,1,0,0,0,0,0};
        System.out.println(Arrays.toString(intArr));
        for (int i=0;i<intArr.length;i++)
        {
            intArr[i] = intArr[i] ^ 1;
        }
        System.out.println(Arrays.toString(intArr));
    }

    /* Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21; */
    public void Calc22( )
    {
        int[] intArr = new int[8];
        for (int i = 0;i< intArr.length;i++)
        {
            intArr[i] = i * 3;
        }
        System.out.println(Arrays.toString(intArr));
    }

    /* Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2; */
    public void Calc23( )
    {
        int[] intArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(intArr));
        for (int i=0;i<intArr.length;i++)
        {
            if (intArr[i] < 6)
            {
                intArr[i] = intArr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }

    /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами; */
    public void Calc24( )
    {
        int[][] intArr = new int[8][8];
        for (int i = 0;i< intArr.length;i++)
        {
            intArr[i][i] = 1;
            intArr[i][intArr.length - i - 1] = 1;
        }
        for (int i = 0;i< intArr.length;i++)
        {
            System.out.println(Arrays.toString(intArr[i]));
        }
    }

    /* Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета); */
    public void Calc25( )
    {
        int[] intArr = {1, 5, 3, 2, 11, 4,23,55,2435,1,-4,-555, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(intArr));
        int minVal = intArr[0];
        int maxVal = intArr[0];
        for (int i=0;i<intArr.length;i++)
        {
            if (intArr[i] < minVal) minVal = intArr[i];
            if (intArr[i] > maxVal) maxVal = intArr[i];
        }
        System.out.println(minVal + ";" + maxVal);
    }

    /* ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        если в массиве есть место, в котором сумма левой и правой части массива равны.
        Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят. */
    public boolean Calc26(int[] intArr)
    {
        boolean res=false;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < intArr.length; i++)
        {

            for (int j = 0; j <= i; j++) { // запускаем цикл для левой части
                leftSum += arr[j]; // складываем все элементы левой части
            }
            for (int k = i + 1; k < arr.length; k++) { // запускаем цикл для правой части
                rightSum += arr[k]; // складываем все элементы правой части
            }
            if (leftSum == rightSum) { // если суммы равны
                int[] leftArray = Arrays.copyOfRange(arr, 0, i + 1); // создаем копию левой части
                int[] rightArray = Arrays.copyOfRange(arr, i + 1, arr.length); // создаем копию правой части
                System.out.println(Arrays.toString(leftArray) + " == " + Arrays.toString(rightArray)); // наглядно показываем результат работы
                return true; // и возвращаем TRUE;
            }
        }
        return false;



        return res;
    }


}
