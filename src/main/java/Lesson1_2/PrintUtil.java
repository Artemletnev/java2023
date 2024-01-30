package Lesson1_2;

public class PrintUtil {
    /**
     * Форматирует строку тремя * до и после
     *
     * @param str строка для форматирования
     */
    public static void printFormatted(String str) {
        System.out.println("***" + str + "***");
        //System.out.printf("***%s***",str); Одинаково с предыдущим

    }

    /**
     * Форматирует строку тремя * до и после
     *
     * @param str строка для форматирования
     */
    public static String getFormatted(String str) {
        return ("***" + str + "***");

    }
}
