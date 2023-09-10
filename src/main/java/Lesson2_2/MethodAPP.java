package Lesson2_2;

public class MethodAPP {

    public static final String TEMPLATE = "int = %d string = %s";
    public static void main(String[] args) {
        int v1 = multiplication(5, 6);
        int v2 = multiplication(3, 12);
        int v3 = multiplication(v1, v2);
        double v4 = 12.5;
        int v5 = multiplication(v1, (int) v4);
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
        System.out.println("v5 = " + v5);
        int v6 = multiplication(v1, v4);
        System.out.println("v6 = " + v6);


        PrintUtil.printFormatted("v6 = " + v6);

        PrintUtil.printFormatted("string to format");
        String g = PrintUtil.getFormatted("string to format");
        System.out.println(g);

        System.out.printf(TEMPLATE, 10,"afg");


    }

    public static int multiplication(int a, int b) {
        //int result  = a * b;
        //return result;
        return a * b;

    }

    public static int multiplication(int a, double b) {
        //int result  = a * b;
        //return result;
        return (int) (a * b);

    }


    public static int multiplication(double a, int b) {
        //int result  = a * b;
        //return result;
        return (int) (a * b);

    }


    // Метод состоит из модификатора доступа + тип значения + имя + набор праметров

    // naming - ClassName  (simple: MyClassName)
    // method, variables - loverCaseUpperCase  (simple: methodName, variablesName)

    //CONSTANTS  - UPPERCASE (snake_case) (simple: upper_case)

    // type - void / real type

    // модификаторы доступа
    // public доступен всем
    // protected в рамках пакета(папки) и наследникам
    //default(no modifier) только в рамках пакета(папки)
    // privat только внутри данного класса


}
