package lesson1_7.Homework.Simple_from_Methodick;

public class Plate {
    private int food;
    private int freePlace;
    private int maxPlace;

    public Plate(int food) {
        this.food = food;
        this.freePlace = 0;
        this.maxPlace = food;
    }

    public void info() {
        System.out.println("В тарелке осталось " + food + " еды");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food - n < 0) {
            System.out.println("In plate havent eat");
            return false;
        } else {
            food = food - n;
            return true;
        }
    }


    public void addFood(Warehouse n) {
        if (n.getStocks() >= (maxPlace - food)) {
            n.setStocks(n.getStocks() - (maxPlace - food));
            food = maxPlace;
            System.out.println("The plate is full");
            return;
        }
        if (n.getStocks() < (maxPlace - food)) {
            food = food + n.getStocks();
            n.setStocks(0);
            System.out.println("The plate have a free place = " + (maxPlace-food));

        }



    }

    public void freePlaceInPlate() {


    }

}
