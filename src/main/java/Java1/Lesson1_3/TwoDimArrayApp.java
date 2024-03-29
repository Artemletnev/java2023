package Java1.Lesson1_3;

import java.util.Arrays;

public class TwoDimArrayApp {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        System.out.println(Arrays.toString(array));

        array[2][3] = 144;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));

        }
        //System.out.println();

        int[] subArray = array[2];
        System.out.println(Arrays.toString(subArray));
        System.out.println();

        int[][] newArray = new int[5][];
        newArray[0] = new int[]{1, 2, 3, 4, 5, 6};
        newArray[3] = new int[]{2, 3, 4, 5, 1};

        System.out.println(Arrays.toString(newArray));

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(Arrays.toString(newArray[i]));

        }
        System.out.println();
        int[][] arr = {{1,2},{3,4}, {123,221, 1232}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
        //int[][][][][] - многомерные массивы
        char[] chars = "Java".toCharArray();

        System.out.println(chars[2]);
        System.out.println("Java".charAt(3));


    }
}
