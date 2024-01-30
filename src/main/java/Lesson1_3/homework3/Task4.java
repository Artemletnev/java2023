package Lesson1_3.homework3;

public class Task4 {
    public static void main(String[] args) {
        //TAsk4
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            int t = array.length - i - 1;
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                array[i][t] = 1;


            }

        }


        printDoubleArray(array);
    }

    public static void printDoubleArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + ",");
            }
        }
    }
}
