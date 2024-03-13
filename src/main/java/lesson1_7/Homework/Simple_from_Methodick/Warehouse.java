package lesson1_7.Homework.Simple_from_Methodick;

public class Warehouse {
    private int stocks;

    public Warehouse(int stocks) {
        this.stocks = stocks;
    }

    public int getStocks() {
        return stocks;
    }

    public void addToFull(int n) {
        n = stocks - n;


    }
}
