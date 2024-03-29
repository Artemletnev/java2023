package Java1.Lesson1_2.Homework;

public class repeat {
    public static void main(String[] args) {
        //TAsk1
        //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        //System.out.println(method(10, 3));
        //TAsk2
        //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        //method2(-4);
        //Task3
        //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        //System.out.println(method3(-5));
        //Task4
        //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
        //nethod("asd", 4);
        //Task5
        // Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        //System.out.println(YEAR(400));


    }

    public static boolean method(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void method2(int a) {
        if (a > -1) {
            System.out.println("the number" + a + " is a plus");
        } else {
            System.out.println("the number" + a + " is a minus");
        }
    }

    public static boolean method3(int a) {
        return a < 0;
    }

    public static void nethod(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean YEAR(int a) {
        //return (a % 400 == 0 | a % 4 == 0);
        if (a % 400 == 0 | a % 4 == 0) {
            if (a % 100 == 0 && a % 400 != 0) {
                return false;
            } else return true;
        } else return false;


    }

}
