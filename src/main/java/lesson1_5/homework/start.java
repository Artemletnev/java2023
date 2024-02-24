package lesson1_5.homework;

public class start {
    public static void main(String[] args) {
        Sotrudnik charboy = new Sotrudnik("ARTEM", "Director", "letnev2012@gmail.com", "89297265093", 370000, 29);

        Sotrudnik[] array = new Sotrudnik[5];
        array[0] = charboy;
        array[1] = new Sotrudnik("Natalya", "BrainFucker", "letneva@gmail.com", "8999999999", 200000, 12);
        array[2] = new Sotrudnik("Andrey", "OP", "111111@gmail.com", "777777777", 400000, 4);
        array[3] = new Sotrudnik("Nikolay", "VG", "l2222@gmail.com", "88888888888888", 500000, 21);
        array[4] = new Sotrudnik("Olga", "TTR", "333@gmail.com", "89666666666666", 100000, 49);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 2) {
                array[i].subjecktInformation();

            }

        }


    }

}
