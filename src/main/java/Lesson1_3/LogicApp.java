package Lesson1_3;

public class LogicApp {
    public static void main(String[] args) {
        int a = 12323;
        if (isPositive(a) && !isZero(a)) {
            System.out.println("Is positive and not zero");
        } else {
            System.out.println("ty lox");
        }


    }

    public static boolean isPositive(int val) {
        return val > 0;
    }

    public static boolean isZero(int val) {
        return val == 0;
    }
}
