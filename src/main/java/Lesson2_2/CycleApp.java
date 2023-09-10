package Lesson2_2;

public class CycleApp {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Если услвие иф соблюдается,то круг пропускается(не пишется)
            }
            if (i > 6) {
                break; // стоп цикла и выход
            }
            PrintUtil.printFormatted("string " + i);
        }
        System.out.println(getDivideByThree());
        PrintUtil.printFormatted("i = " + getDivideByThree());

//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//
//        }
        for (int i = 0, j = 10; i < j ; i++, j--) { // цикл с двумя переменными
            System.out.println("i=" + i + " j=" + j);
            System.out.println();

        }
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i=" + i + " j=" + j); // вложенный цикл

            }

        }
    }
    // for(;;){ - бесконечный цикл
    //}


    public static int getDivideByThree() {   // метод возвращает значение при выполненном условии
        for (int i = 2; i < 10; i = i + 2) {
            if (i % 3 == 0) {
                return i;
            }

        }
        return 0;//в случае если значения в установленном диапазоне нет, то должно вернуть хоть что то.
    }
}
