package Java1.lesson1_7;

import java.util.Arrays;
import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {
        String str = "String";
        str.toCharArray();
        System.out.println(Arrays.toString(str.toCharArray()));


        String str2 = new String(str.toCharArray());

        str = str.toUpperCase();
        System.out.println(str.startsWith("S")); // начинается с
        System.out.println(str.contains("ing")); //содержит
        System.out.println(str.equals("str")); // одинаковы ли строки фолс
        System.out.println(str.equalsIgnoreCase("StRiNg")); // одинаковы ли строки с игнорирование ловер аппер кейса тру

        String s = 1 + " " + 2 + " 123" + 1;
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append(1).append(" ").append(2).append("123");


        String newString = stringBuilder.toString();


    }
}
