package lesson1_6;

public class Car extends Transport {
    //boolean crush;
    protected int year;
    protected String model;

    public Car(int year, String model) {
        System.out.println("this is a car counstractor");
        this.year = year;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model + " " + year;
    }

    void info() {
        System.out.println(this);
    }

    @Override
    public void wroomWroom() {
        System.out.println("Wroom");


    }


}
