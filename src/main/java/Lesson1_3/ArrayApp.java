package Lesson1_3;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] array = new int[5];
        //int[] array2 = array; - выделение памяти не будет, ссылка на тот же объект в памяти


        for (int i = 0; i < array.length; i++) {
            array[i] = 100 + i * 100;

        }

        int[] arr = {1, 2, 3, 4, 5};

        printArray(array);
        printArray(arr);

        String[] arrayStr = new String[10];

        Arrays.fill(arrayStr, "a"); //заполняет массив значение по умолчанию
        System.out.println(Arrays.toString(arrayStr));

        boolean[] arrayBoolean = {};
        System.out.println(Arrays.toString(arrayBoolean));

        int integer = 100;
        method1(integer);
        System.out.println("Integer = " + integer);

        int[] integers = {1,2,3,4,5,6};
        method2(integers);
        System.out.println(Arrays.toString(integers));



    }
    public static void method1(int a){
        a= a+10;
    }
    public static void method2(int[] a){
        a[2] = 100500;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");


        }
        System.out.println();
    }
}
