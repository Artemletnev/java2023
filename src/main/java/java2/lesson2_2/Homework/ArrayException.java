package java2.lesson2_2.Homework;

public class ArrayException extends Exception {


    public ArrayException(String message) {
        super(message);

    }
}

class Array {
    private int value = 4;


    public int getValue() {
        return value;
    }
    //    public static String arrayCheck(String[][] array, int value) throws ArrayException {
//        if (array[0].length != array[1].length && array[0].length != array[2].length && array[0].length !=array[3].length)
//
//
//    }

    public static void checkTrue(String[][] array) throws ArrayException {


        if (!arrayTrue(array)) throw new ArrayException("Ошибка, чел, дай норм массив");
        {
            return;

        }


    }

    public static boolean arrayTrue(String[][] array) {
        Array array1 = new Array();

        if (array.length != array1.getValue()) {
            return false;
        } else if (array[0].length != array[1].length || array[0].length != array[2].length || array[0].length != array[3].length) {
            return false;
        } else return true;

    }


    static void sumNumbers(String[][] array ) throws MyArrayDataException {
        int res = 0;
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            c = 0;
            for (int j = 0; j < array.length; j++) {
                try {
                    c = checkNumber(array[i][j], i,j);
                    res = res + c;

                }catch (MyArrayDataException e){
                    e.getMessage();
                    e.printStackTrace();
                    c=0;


                }
                if (i == array.length - 1 && j == array.length -1){
                    System.out.println("Результат сложения всех элементов массива : " + res);

                }





            }
        }


    }

     static int checkNumber(String s, int x, int y) throws MyArrayDataException {
        int res  = 0;
        String firstElement = String.valueOf(x);
        String secondElement = String.valueOf(y);

        if(!isInteger(s)) throw new MyArrayDataException("Ошибка данных в координатах: x = " + firstElement + " y = " + secondElement);
        res = Integer.parseInt(s);
        return res;



    }






    static boolean isInteger(String string)  {
        if (string == null) {
            return false;
        }
        int length = string.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (string.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = string.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;



    }


}






