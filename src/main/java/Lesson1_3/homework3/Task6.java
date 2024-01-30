package Lesson1_3.homework3;

public class Task6 {
    public static void main(String[] args) {
        //Task6
        //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        int[]   array = {1,2,4,56,7,14,2323};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int indexMaxValue = 0;
        int indexMinValue = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
                indexMaxValue = i;
            }
            if (array[i]< min) {
                min = array[i];
                indexMinValue = i;

            }
        }
        System.out.println("The max value is "+ max +" with index "+ indexMaxValue);
        System.out.println("The min value is "+ min +" with index "+ indexMinValue);

    }
}
