package lesson1_6;



// Is a - выражение
public class Van extends Car {
    int seats;

    public Van(String model, int year, int seats) {
        super(year, model);
        System.out.println("this is a van counstractor");
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    @Override
    void printName(){
        System.out.println("this is a ven");
    }
}
