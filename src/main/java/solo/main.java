package solo;

import java.awt.*;

public class main {
    public static void main(String[] args) {

        Company one = new Company("Lenar+Lera", 0, 44520);
        Company two = new Company("Artem+Natasha", 0, 41677);
        //Company three = new Company("LISA", 0,0);
        Company[] array = new Company[Company.count];
        array[0] = one;
        array[1] = two;
        //array[2]=three;
        int totalPayed = 0;
        one.info();
        two.info();
        //three.info();

        for (int i = 0; i < array.length; i++) {
            totalPayed = array[i].getPayd() + totalPayed;

        }
        System.out.println("В общей сложности ребятам вечеринка обошлась в " + totalPayed + " рублей");
        int personalDebet = totalPayed / Company.count;

        for (int i = 0; i < array.length; i++) {

            if (array[i].getPayd() < personalDebet) {
                array[i].setDebt((array[i].getDebt() + (personalDebet - array[i].getPayd())));
                System.out.println("Компания " + array[i].getName() + " должна заплатить " + array[i].getDebt() + " рублей");

            }
            if (array[i].getPayd() > personalDebet) {
                array[i].setMustGet((personalDebet - array[i].getPayd()) * -1);
                System.out.println("Компания " + array[i].getName() + " должна получить " + array[i].getMustGet());


            }
        }


    }
}
