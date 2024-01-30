package Lesson1_3.homework3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TASK5 {
    public static void main(String[] args) {
        //TAsk5
        //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        int initialValue = 15;
        int len = 10;
        //printArray(arrayWTF(initialValue,len));
        System.out.println(Arrays.toString(arrayWTF(initialValue,len)));


    }

    public static int[] arrayWTF(int initialValue, int len) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
