package lesson1_5;

import java.util.Arrays;

public class DemoApp {
    public static void main(String[] args) {
        // new - это создание нового объекта
        Car car = new Car("dodge", 2020,false);
        Robot robot = new Robot("Artem", 22);
        robot.getAge();
        Robot[] robots = new Robot[10];
        for (int i = 0; i < robots.length; i++) {
            robots[i] = new Robot("Robot"+ (i+1), (1+i));
        }

        for (Robot robot1 : robots){
            robot1.info();
        }


        // Construktor








//        car.whellsNumber = 4;
//        car.info();
//        car.crash();
//        car.info();
//        car.repair();
//        car.info();
//        String carModel = car.getModel();





//        Car car2 = new Car();
//        car2.model = "Ford";
//        car2.year = 1988;
//        car2.whellsNumber = 2;
//        System.out.println("Model = " +car2.model + "  year = " + car2.year + " was crashed = " + car2.wasCrashed + " wheelsNumber = " + car2.whellsNumber );
//        System.out.println("Model = " +car.model + "  year = " + car.year + " was crashed = " + car.wasCrashed + " wheelsNumber = " + car.whellsNumber );
//
//
//        int whellsNumber = Car.whellsNumber;
//        String model = car.model;


        //Car[] cars =new Car[]{car2,car};

    }
}
