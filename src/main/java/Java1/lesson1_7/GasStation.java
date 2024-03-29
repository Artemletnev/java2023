package Java1.lesson1_7;

public class GasStation {
    private int avaliable;


    public GasStation(int freeVolume) {
        this.avaliable = freeVolume;
    }

    public int getAvaliable() {
        return avaliable;
    }
/*
Заправить указанное количество литров
 */
    public void refill(int amount) {
        this.avaliable = this.avaliable - amount;
    }

    @Override
    public String toString() {
        return "GasStation{" +
                "avaliable=" + avaliable +
                '}';
    }

    public void info(){
        System.out.println(this);
    }
}
