package lesson1;

public abstract class Animals {
    protected String name;


    public Animals(String name) {
        this.name = name;
    }
    abstract void calc();

    void info(){
        System.out.println("Animal");
    }
}
