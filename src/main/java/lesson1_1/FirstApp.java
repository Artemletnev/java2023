package lesson1_1;

public class FirstApp {
    public static void main(String[] args) {
        System.out.println("Hellow, world");

        int name = 10;

        float val = 10;
        double valie = 1.0;

        int b = 100 + name;
        System.out.println("b = " + b + " ss");

        int c = (name + b) * 2;
        System.out.println("c = " + c);

        int a = 42;
        a++;
        System.out.println("a = " + a);
        a--;
        System.out.println("a = " + a);
        a += 10;
        System.out.println("a = " + a);
        a -= 10;
        System.out.println("a = " + a);
        a *= 10;
        System.out.println("a = " + a);
        a /= 10;
        System.out.println("a = " + a);

        boolean boolValue = true;
        System.out.println(boolValue);
        int v1 = 177;
        int v2 = 15;

        boolean result = v1 > v2;
        System.out.println(result);

        if (result) {
            System.out.println("v1 > v2");
        } else if (v1 < v2) {
            System.out.println("v1 < v2");

        } else {
            System.out.println("v1 = v2");
        }
        drawCat();
        drawCat();
        drawCat();


    }

    public static void drawCat() {
        System.out.println(" _..---...,\"\"-._ ,/}/)\n" +
                " .'' , ``..'(/-<\n" +
                " / _ { ) \\\n" +
                " ; _ `. `. < a(\n" +
                " ,' ( \\ ) `. \\ __.._ .: y\n" +
                " ( <\\_-) )'-.____...\\ `._ //-'\n" +
                " `. `-' /-._))) `-._)))\n" +
                " `...' ");


    }

    // 2 типа данных
    // - ссылочные
    // - примитивные


    // Численные типа
    // byte - -128 ..... 127
    // short - 2(16)    -2(15)......2(15) - 1
    // int - 2(32)
    // long - 2(64)
    // числа с плавующей точкой
    // float - 2(32)
    // double - 2(64)


    // boolean
    // true/false

    // Символьный
    // char(ASCII/Unicod)
}
