package java2.lesson2_2.Homework;

import java.util.Arrays;

public class main {
    public static void main(String[] args)  {
        String[][] array = {{"1","1","1" ,"1"},{"1","g","1","1"}, {"1","1","1","1"}, {"1","y","1","1"}};





















        try {
            Array.checkTrue(array);
            Array.sumNumbers(array);
        } catch (ArrayException e){
            e.printStackTrace();

        } catch (MyArrayDataException e) {
            e.getMessage();
        }


    }





}
