package Lesson1_3.homework3;

import java.util.Arrays;

public class TASK8 {
    public static void main(String[] args) {
        //Task8
        //Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
        // Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
        int[] array = {1, 2, 3};
        int n = 2;
        System.out.println(Arrays.toString(array));
        System.out.println();
        int t = array[0];
        int k = array[1];
        for (int i = 0; i < n; i++) {
            k = array[i];
            array[i] = t;



        }







//    public static int[] arraySDVIG(int[] arr, int n){
//
//        int t = arr[0];
//        for (int i = 0; i <= n; i++) {
//            arr[i] = t;
//            t=arr[i];
//
//
//        }
//
//
    }
}
