package java2.lesson2_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainEX {
    public static void main(String[] args) {
//        try {
//            int[] r = {1, 2, 3};
//            r[60] = 1;
//            int a = 10 / 0;
//
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//            System.out.println("Деление на 0");
//
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//            System.out.println("выход за предел массива");
//        } catch (Exception e) {
//            System.out.println("Перехват по супер классу");
//            e.printStackTrace();
//        }
//
//
//        System.out.println("end");


//
//        int[] array = {1,2,3};
//        array[50] = 123;


//        try {
//            a();
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//        System.out.println("ss");
        try {
            int res = Factorial.getFactorial(-10);
            System.out.println(res);
        }catch (FactorialException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }











    }

    public static void doSomething()throws IOException {
//        FileInputStream fileInputStream =null;
//        try {
//            fileInputStream = new FileInputStream("123.txt");
//
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }finally {// нужно чтобы например закрыть файл после его прочтения, не важно выполнится что то из трай кеч ии нет
//            fileInputStream.available();
//        }

        try (FileInputStream fileInputStream =new FileInputStream("123.txt")){// в данном случае файл автоматически закроется
            fileInputStream.read();

        }

    }

//    public static int doSomething(){
//        try {
//            System.out.println("222");
//            return 1;
//        }finally {
//            return 2;
//        }
//    }

    static int sqrt(int n){
        if (n>0){
            return n/2;
        } throw new ArithmeticException("Нельзя отрицательное");
    }

    private static void a() throws FileNotFoundException {
        FileInputStream fileInputStream =new FileInputStream("1.txt");

    }

    private static void b() {
        c();

    }

    private static void c() {
        int b = 10 / 0;
    }
}
