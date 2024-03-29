package Java1.Lesson1_3.homework3;

public class TAsk2 {
    public static void main(String[] args) {
        //Task2
        //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

        }
        printArray(array);

    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i] + ",");

        }
    }
}
