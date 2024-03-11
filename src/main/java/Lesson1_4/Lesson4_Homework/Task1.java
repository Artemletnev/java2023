package Lesson1_4.Lesson4_Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    //Заявили поле
    public static char[][] place;
    //заявили размер поля
    public static final int PLACESIZE = 3;

    // Заявили чем будет заполнено поле
    public static final char ZAPOLNENO = '*';

    //Заявили количество точек для победы
    public static final int WIN = 3;

    //Ход человека

    public static final char HUMAN_DOTS = 'x';

    //Ход робота
    public static final char ROBOT_DOTS = 'o';

    //Сканнер написанного человеком

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int POTENCIALWIN = 2;

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
    //y= i
    //x= j
    public static boolean horizontalCHekPotencialWin() {
        int count = 0;
        for (int i = 0; i < place.length; i++) {
            count = 0;
            for (int j = 0; j < place[i].length; j++) {
                if (place[i][j] == HUMAN_DOTS) {
                    count++;
                    if (count == POTENCIALWIN) {
                        for (int k = 0; k < place.length; k++) {
                            if (place[i][k] == ZAPOLNENO) {
                                place[i][k] = ROBOT_DOTS;
                                return true;
                            }
                        }
                    }
                }

            }
        }
        return false;

    }

    public static boolean vertikalCheckPotencialWin() {
        int count = 0;
        for (int i = 0; i < place.length; i++) {
            count = 0;
            for (int j = 0; j < place[i].length; j++) {
                if (place[j][i] == HUMAN_DOTS) {
                    count++;
                    if (count == POTENCIALWIN) {
                        for (int k = 0; k < place.length; k++) {
                            if (place[k][i] == ZAPOLNENO) {
                                place[k][i] = ROBOT_DOTS;
                                return true;
                            }
                        }


                    }
                }
            }
        }
        return false;

    }

    public static boolean diagonalCheckPotencialWin() {
        int count = 0;
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if (i == j) {
                    if (place[i][j] == HUMAN_DOTS) {
                        count++;
                        if (count == POTENCIALWIN) {
                            for (int k = 0; k < place.length; k++) {
                                if (place[k][k] == ZAPOLNENO) {
                                    place[k][k] = ROBOT_DOTS;
                                    return true;
                                }
                            }

                        }
                    }

                }

            }
        }
        return false;
    }

    public static boolean reverseDiagonalCheckPotencialWin() {
        int count = 0;
        int iSegment = 0;
        int jSegment = place.length - 1;
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if (i == iSegment && j == jSegment) {
                    iSegment++;
                    jSegment--;
                    if (place[i][j] == HUMAN_DOTS) {
                        count++;
                        if (count == POTENCIALWIN) {
                            iSegment = 0;
                            jSegment = place.length - 1;
                            for (int k = 0; k < place.length; k++) {
                                for (int l = 0; l < place[k].length; l++) {
                                    if (place[iSegment][jSegment] == ZAPOLNENO) {
                                        place[iSegment][jSegment] = ROBOT_DOTS;
                                        return true;

                                    }
                                    iSegment++;
                                    jSegment--;

                                }

                            }

                        }
                    }
                }


            }
        }
        return false;
    }

    public static boolean firstRobotTurn() {

        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if (place[i][j] == HUMAN_DOTS) {
                    if (i + 1 <= place.length - 1) {
                        if (place[i + 1][j] == ZAPOLNENO) {
                            place[i + 1][j] = ROBOT_DOTS;
                            return true;
                        }
                        if (j + 1 <= place.length - 1) {
                            if (place[i + 1][j + 1] == ZAPOLNENO) {
                                place[i + 1][j + 1] = ROBOT_DOTS;
                                return true;
                            }

                        }
                        if (j - 1 >= 0) {
                            if (place[i + 1][j - 1] == ZAPOLNENO) {
                                place[i + 1][j - 1] = ROBOT_DOTS;
                                return true;
                            }
                        }


                    }
                    if (i - 1 >= 0) {
                        if (place[i - 1][j] == ZAPOLNENO) {
                            place[i - 1][j] = ROBOT_DOTS;
                            return true;

                        }
                        if (j + 1 <= place.length - 1) {
                            if (place[i - 1][j + 1] == ZAPOLNENO) {
                                place[i - 1][j + 1] = ROBOT_DOTS;
                                return true;

                            }
                        }
                        if (j - 1 >= 0) {
                            if (place[i - 1][j - 1] == ZAPOLNENO) {
                                place[i - 1][j - 1] = ROBOT_DOTS;
                                return true;

                            }
                        }
                    }

                }

            }
        }




        return false;

    }

    public static boolean randomRobotTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(PLACESIZE);
            y = RANDOM.nextInt(PLACESIZE);
        } while (!checkNumber(x, y));
        System.out.println("HOD ROBOTA V y= " + (y + 1) + "  x= " + (x + 1));
        place[y][x] = ROBOT_DOTS;
        return true;

    }

    public static void aiTurn() {
        if (horizontalCHekPotencialWin()) return;
        if (vertikalCheckPotencialWin()) return;
        if (diagonalCheckPotencialWin()) return;
        if (reverseDiagonalCheckPotencialWin()) return;
        if (firstRobotTurn()) return;
        //if (randomRobotTurn()) return;


//        int x, y;
//        do {
//            x = RANDOM.nextInt(PLACESIZE);
//            y = RANDOM.nextInt(PLACESIZE);
//        } while (!checkNumber(x, y));
//        System.out.println("HOD ROBOTA V y= " + (y + 1) + "  x= " + (x + 1));
//        place[y][x] = ROBOT_DOTS;


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
        if (upperDiagonalCheck(symbol)) {
            return true;
        }
        if (loverDiagonalCheck(symbol)) {
            return true;
        }
        if (lowerReverseDiagonalCheck(symbol)) {
            return true;
        }
        if (upperReverseDiagonalCheck(symbol)) {
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
        int iSegment = 0;
        int jSegment = place.length - 1;

        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if (i == iSegment && j == jSegment) {
                    iSegment++;
                    jSegment--;
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

    public static boolean lowerReverseDiagonalCheck(char symbol) {
        int count = 0;
        int iSegment = 1;
        int jSegment = place.length - 1;

        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if (i == iSegment && j == jSegment) {
                    iSegment++;
                    jSegment--;
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

    public static boolean upperReverseDiagonalCheck(char symbol) {
        int count = 0;
        int iSegment = 0;
        int jSegment = place.length - 2;
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if (i == iSegment && j == jSegment) {
                    iSegment++;
                    jSegment--;
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

    //Метод для проверки верхней от центра диагонали
    public static boolean upperDiagonalCheck(char symbol) {
        int count = 0;
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if (j > i && j < i + 2)
                    if (place[i][j] == symbol) {
                        count++;

                        if (count == WIN) {
                            return true;
                        }
                    }


            }
        }
        return false;
    }

    //Метод для проверки нижней от центра диагонали
    public static boolean loverDiagonalCheck(char symbol) {
        int count = 0;
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if (i > j && j > (i - 2)) {
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
