package Java1.lesson1_7;

import Java1.lesson1_6.Homework.Cat;

public class Car {
    private int volume;
    public Car(int volume){
        this.volume=volume;
    }

    public int getVolume() {
        return volume;
    }
    public void takeGasoline(GasStation station){
        station.refill(volume);

    }
    public void findGasoline(GasStation[] stations){
        for (GasStation station : stations){
            if( station.getAvaliable()<volume){
                continue;
            }
            station.refill(volume);
            break;
        }
    }
}
