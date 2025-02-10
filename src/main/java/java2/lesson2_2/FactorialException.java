package java2.lesson2_2;

public class FactorialException extends Exception {


    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public FactorialException(String message, int num) {
        super(message);
        this.num = num;
    }
}

class Factorial {
    public static int getFactorial(int num) throws FactorialException {
        int res = 1;
        if (num < 1) throw new FactorialException("Число не может быть менее 1", num);
        for (int i = 1; i <=num ; i++) {
            res*=i;
        }
        return res;
    }
}



