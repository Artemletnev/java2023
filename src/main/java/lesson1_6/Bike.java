package lesson1_6;

public class Bike extends Transport{
    int whellsNimber;

    public Bike(int whellsNimber) {
        this.whellsNimber = whellsNimber;
    }

    @Override
    public void wroomWroom() {
        System.out.println("BIKE WROOM");
    }

    @Override
    public final void printInventionDate() {
        System.out.println("2000");
    }
}
