package Java1.Lesson1_3.homework3;

public class Task7 {
    public static void main(String[] args) {
        //Task7
        //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        int[] array = {2, 1, 1, 2, 1};
        System.out.println(checkArray(array));


    }

    public static boolean checkArray(int[] arr) {
        int summArrayValue = 0;
        for (int i = 0; i < arr.length; i++) {
            summArrayValue = summArrayValue + arr[i];
        }
        int summRight = 0;
        int summLeft = 0;
        int sovpadenie = 0;
        for (int i = 0; i < arr.length; i++) {
            summLeft = arr[i] + summLeft;
            //System.out.println("summ Left " + summLeft);
            summRight = summArrayValue - summLeft;
            //System.out.println("summ Right " + summRight);
            if (summLeft == summRight) {
                sovpadenie = 1;

            }
            //System.out.println();

        }
        return sovpadenie>0;

    }
}
