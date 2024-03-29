package Java1.Lesson1_2.Homework;

public class task1 {
    public static void main(String[] args) {
        //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.


        System.out.println(proverkaChisla(2, 12));
    }

    public static boolean proverkaChisla(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;

//        if ((a + b) >= 10 & (a + b) <= 20) {
//            return true;
//
//        } else {
//            return false;
//        }


    }
}
