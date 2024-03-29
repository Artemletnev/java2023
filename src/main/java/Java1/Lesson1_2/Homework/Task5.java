package Java1.Lesson1_2.Homework;

public class Task5 {
    //Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void main(String[] args) {
        System.out.println(checkYear(100));


    }

    public static boolean checkYear(int a) {
        if(a%400 ==0){
            return true;
        } else if (a%4 == 0) {
            if(a%100 == 0){
                return false;
            } else {
                return true;
            }

        }else {
            return false;
        }

    }
}
