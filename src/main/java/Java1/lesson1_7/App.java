package Java1.lesson1_7;

public class App {
    public static void main(String[] args) {
        Car car = new Car(60);
        Car car2 = new Car(100);
        GasStation gasStation = new GasStation(1000);
        gasStation.info();

        car2.takeGasoline(gasStation);
        car.takeGasoline(gasStation);
        gasStation.info();


    }
}
