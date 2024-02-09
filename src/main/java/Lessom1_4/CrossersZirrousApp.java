package Lessom1_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CrossersZirrousApp {

    //Поле заявили
    public static char[][] map;

    //Размер поля заявили
    public static final int SIZE = 3;
    // Точек для победы
    public static final int DOTS_TO_WIN = 3;

    // Описание точек
    public static final char DOT_EMPTY = '*';

    public static final char DOT_X = 'X';
    public static final char DOT_Y = 'Y';
    public static final char DOT_0 = '0';

    // Сканнер для обучения ходить человека
    public static final Scanner SCANNER = new Scanner(System.in);

    //рандомное число
    public static final Random RANDOM = new Random();

    // Инициализируем поле
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], DOT_EMPTY); //- заполнение каждого элемента масиива заданным значением
            //for (int j = 0; j < map[i].length; j++) {   //Также заполнение массива, как и Arrays.fill
            //    map[i][j] = DOT_EMPTY;
            //}
        }

    }

    /**
     * Выводим игровое поле на экран
     */
    public static void printMap() {

        //Нумеруем столбцы поля(map)
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Нумеруем строки поля(map)


        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");

            }
            System.out.println();
        }
    }

    /**
     * Метод хода человека
     */
    public static void humaTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;

        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;

    }

    /**
     * Проверка валидности заполненного человеком поля
     *
     * @param x - координата Х
     * @param y - Координата Y
     * @return Возвращает "да" или "нет"
     */

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] != DOT_EMPTY) {
            return false;
        }
        return true;

    }

    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);

        } while (!isCellValid(x, y));
        System.out.println("Робот делает ход в " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_0;
    }

    // проверка победы
    public static boolean checkWin(char symbol) {
        // проверка победы в строках
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) {
            return true;
        }
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) {
            return true;
        }
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        //проверка побуды в столбцах
        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) {
            return true;
        }
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) {
            return true;
        }
        // проверка победы в диагоналях
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) {
            return true;
        }
        return false;
    }

    /*
    Проверка что в поле не осталось свободных ячеек
     */
    public static boolean isMapIsFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humaTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("The human WIN!");
                break;
            }
            if (isMapIsFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_0)) {
                System.out.println("The robot WIN!, YOU SUCK!");
                break;

            }
            if (isMapIsFull()) {
                System.out.println("Ничья");
                break;
            }


        }
        System.out.println("Game OVER");
    }
}

