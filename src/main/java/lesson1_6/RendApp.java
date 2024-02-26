package lesson1_6;

import java.util.Arrays;

public class RendApp {
    public static void main(String[] args) {
        Car car = new Car(2012, "Toyota");
        System.out.println();
        Car furgon = new Van("DOdge", 2022, 7);
        Car cabrio = new Cabrio("Peugeot", 2010, true);

        System.out.println(car instanceof Van); //false
        System.out.println(car instanceof Car);// true
        System.out.println(furgon instanceof Car);// true
        System.out.println(cabrio instanceof Van);// false
        System.out.println(cabrio instanceof Transport);//true

        Car[] cars = {car, cabrio, furgon};

        for (Car c : cars) {
            System.out.println(c.getModel());
        }
        System.out.println();

        System.out.println("Only vans");
        for (Car c : cars) {
            if (c instanceof Van) { // Является ли "с" - МИНИВЕНОМ
                Van v = (Van) c;
                System.out.println("This is a van " + v.getSeats());
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();



        Transport[] transports = {car, cabrio, furgon};



        for (Transport transport : transports){
            System.out.println(transport);
        }
        System.out.println();


        car.info();
        cabrio.info();

        System.out.println();

        System.out.println(Arrays.toString(transports));





    }
}
