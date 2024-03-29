package Java1.Lesson1_2.Homework;

public class Task4 {
    //Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void main(String[] args) {
        printString(7, "sadsd");

    }
    public static void printString(int a, String b){
        for (int i = 0; i < a; i++) {
            System.out.println(b);

        }
    }
}
