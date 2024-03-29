package Java1.lesson1_6;

public class App {
    public static void main(String[] args) {
        Transport t1 = new Car(1990, "Kia");
        Transport t2 = new Car(2233, "Peugeot");
        Transport t3 = new Bike(3);

        Transport[] transports = {t1,t2,t3};
        for (Transport transport: transports){
            transport.printInventionDate();
        }
    }
}
