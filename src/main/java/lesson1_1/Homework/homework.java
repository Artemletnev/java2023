package lesson1_1.Homework;

public class homework {
    public static void main(String[] args) {
        //Task1
        //jungle();
        //Task2
        //checkSumSign(-5,3);
        //Task3
        //int value = 699;
        //printColor(value);
        //Task4
        //compareNumbers();


    }

    public static void jungle() {
        System.out.println("oe");
        System.out.println("two");
        System.out.println("three");
    }

    //3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
    // Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static void checkSumSign(int a, int f) {
        if ((a + f) >= 0) {
            System.out.println("Plus");
        } else {
            System.out.println("not Plus");
        }
    }

    //Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
    // Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
    public static void printColor(int a) {
        if (a <= 0) {
            System.out.println("RED");
        } else if (a > 0 && a <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }

    }

    //Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
    // Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers() {
        int a = 3;
        int b = 2;
        if(a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

}
