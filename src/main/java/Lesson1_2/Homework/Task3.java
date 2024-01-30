package Lesson1_2.Homework;

public class Task3 {
    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static void main(String[] args) {
        System.out.println(checkNumber(-5));
    }
    public static boolean checkNumber(int a){
        if(a>=0){
            return false;
        }else {
            return true;
        }
    }
}
