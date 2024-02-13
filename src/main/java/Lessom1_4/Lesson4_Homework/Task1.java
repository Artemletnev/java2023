package Lessom1_4.Lesson4_Homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    //Заявили поле
    public static char[][] place;
    //заявили размер поля
    public static final int PLACESIZE = 5;

    // Заявили чем будет заполнено поле
    public static final char ZAPOLNENO = '*';

    //Заявили количество точек для победы
    public static final int WIN = 4;

    //Ход человека

    public static final char HUMAN_DOTS = 'x';

    //Ход робота
    public static final char ROBOT_DOTS = 'o';

    //Сканнер написанного человеком

    public static final Scanner SCANNER = new Scanner(System.in);

    //Рандомное число для робота

    public static final Random RANDOM = new Random();

    //Инициализируем само поле

    public static void initionPlace() {
        place = new char[PLACESIZE][PLACESIZE];
        for (int i = 0; i < place.length; i++) {
            Arrays.fill(place[i], ZAPOLNENO);

        }
    }

    // Выводим поле в консоль
    public static void printThePlace() {
        //необходимо пронумеровать столбцы
        for (int i = 0; i <= place.length; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

        //нумеруем строки
        for (int i = 0; i < place.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < place[i].length; j++) {
                System.out.print(place[i][j] + " ");

            }
            System.out.println();

        }

    }

    // Метод хода человека
    public static void humanMove() {
        int x, y;
        do {
            System.out.println("Введите значение х в пределах от 1 до " + PLACESIZE);
            x = SCANNER.nextInt() - 1;
            System.out.println("Введите значение y в пределах от 1 до " + PLACESIZE);
            y = SCANNER.nextInt() - 1;
        } while (!checkNumber(x, y));
        place[y][x] = HUMAN_DOTS;
        System.out.println("y=" + (y + 1) + " " + "x=" + (x + 1));

    }

    // Проверка соответствия введенных пользователем цифр
    public static boolean checkNumber(int x, int y) {
        if (x < 0 || x >= PLACESIZE || y < 0 || y >= PLACESIZE) {
            return false;
        }
        if (place[y][x] != ZAPOLNENO) {
            return false;

        }
        return true;
    }
    // Метод хода робота

    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(PLACESIZE);
            y = RANDOM.nextInt(PLACESIZE);
        } while (!checkNumber(x, y));
        System.out.println("HOD ROBOTA V y= " + (y + 1) + "  x= " + (x + 1));
        place[y][x] = ROBOT_DOTS;


    }

    //Метод определения победы
    public static boolean checkWinMoment(char symbol) {
        if (horizontalCheck(symbol)) {
            return true;
        }
        if (vertikalCheck(symbol)) {
            return true;
        }
        if (diagonalChek(symbol)) {
            return true;
        }
        if (reverseDiagonalCheck(symbol)) {
            return true;
        }




        return false;
    }

    //Метод проверки горизонтали
    public static boolean horizontalCheck(char symbol) {
        int count = 0;
        for (int i = 0; i < place.length; i++) {
            count = 0;
            for (int j = 0; j < place[i].length; j++) {
                if (place[i][j] == symbol) {
                    count++;

                    if (count == WIN) {
                        return true;
                    }

                }
                if (place[i][j] != symbol) {
                    count = 0;
                }


            }
        }
        return false;


    }
    //Метод проверки вертикали

    public static boolean vertikalCheck(char symbol) {
        int count = 0;
        for (int i = 0; i < place.length; i++) {
            count = 0;
            for (int j = 0; j < place[i].length; j++) {
                if (place[j][i] == symbol) {
                    count++;

                    if (count == WIN) {
                        return true;
                    }
                }

            }
        }
        return false;

    }
    // Метод проверки диагонали

    public static boolean diagonalChek(char symbol) {
        int count = 0;
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if (i == j) {
                    if (place[i][j] == symbol) {
                        count++;

                        if (count == WIN) {
                            return true;
                        }
                    }
                }

            }
        }
        return false;

    }
    //Метод проверки обратной диагонали

    public static boolean reverseDiagonalCheck(char symbol) {
        int count = 0;
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if (i == 0 && j == place.length - 1) {
                    if (place[i][j] == symbol) {
                        count++;
                        if (count == WIN) {
                            return true;
                        }

                    }

                }
                if (i == j) {
                    if (place[i][j] == symbol) {
                        count++;
                        if (count == WIN) {
                            return true;
                        }

                    }

                }
                if(i== place.length-1 && j==0){
                    if (place[i][j] == symbol) {
                        count++;
                        if (count == WIN) {
                            return true;
                        }

                    }


                }
            }


        }
        return false;
    }


    //Метод проверки того, что на карте есть свободное место

    public static boolean checkSlotsInPlace() {
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if (place[i][j] == ZAPOLNENO) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        //Task1
        //1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
        initionPlace();
        printThePlace();
        while (true) {
            humanMove();
            printThePlace();
            if (checkWinMoment(HUMAN_DOTS)) {
                System.out.println("Human win!");
                break;
            }
            if (checkSlotsInPlace()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printThePlace();
            if (checkWinMoment(ROBOT_DOTS)) {
                System.out.println("ROBOT win!");
                break;

            }
            if (checkSlotsInPlace()) {
                System.out.println("Ничья");
                break;


            }
        }
        System.out.println("Game over");
    }
}
