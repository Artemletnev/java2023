package Lesson2_2.Homework;

public class Task2 {
    public static void main(String[] args) {
        // Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом\
        proverka(-5);


    }
    public static void proverka(int a){
        if(a>=0){
            System.out.println("The number " + a + " is a positive");
        } else {
            System.out.println("The number " + a + " is a negative");
        }
    }
}
