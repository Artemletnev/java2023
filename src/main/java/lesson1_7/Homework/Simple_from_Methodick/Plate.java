package lesson1_7.Homework.Simple_from_Methodick;

public class Plate {
    private int food;
    private int freePlace;

    public Plate(int food) {
        this.food = food;
        this.freePlace = 0;
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

    public void addFood(int n){
        food = food + n;

    }
    public void freePlaceInPlate(){
        freePlace =



    }

}
