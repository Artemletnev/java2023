package lesson1_5;

public class Car {
    public static int whellsNumber = 0;
    // fields - вначале объявляются поля

    private String model;
    private String modelFull;
    private int year;
    private boolean wasCrashed;
    public Car(String model, int year, boolean wasCrashed){
        this.model=model;
        this.year = year;
        this.wasCrashed=wasCrashed;
    }
    public Car(String model, int year){
        // Можно существенно упростить написание этого метода
        // this(model,year, false); - делает тоже самое что и 3 строчки ниже!!!!
        this.model=model;
        this.year=year;
        wasCrashed=false;
    }
    public Car(String model){
        this(model, 2020);
    }








    /**
     * Выводит информацию по машине
     *
     */

    public void info(){
        System.out.println("Model = " +model + "  year = " + year + " was crashed = " + wasCrashed );
    }
    public void printModel(){
        System.out.println(model);
    }

    //некие геттеры, которые создаются автоматически(дай информацию из этого поля)
    // нужно чтобы "прятать" код и нельзя было переписать значение поля объекта

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isWasCrashed() {
        return wasCrashed;
    }

    // "Сеттеры"(установи

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year>0){
            this.year = year;
        } else {
            System.out.println("Error");
        }
    }

    public void setWasCrashed(boolean wasCrashed) {
        this.wasCrashed = wasCrashed;
    }
    public void crash(){
        System.out.println("Car was crashed=(");
        wasCrashed = true;
    }
    public void repair(){
        if (wasCrashed){
            wasCrashed = false;
            System.out.println("was rep");
        } else {
            System.out.println("Nothing to rep");
        }

    }


}
