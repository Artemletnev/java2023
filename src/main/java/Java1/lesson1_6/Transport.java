package Java1.lesson1_6;

public abstract class Transport extends Invation{
    protected String color;


    void printName(){
        System.out.println("Transport mfk");
    }
    public abstract void  wroomWroom();

    @Override
    public void printInventionDate() {
        System.out.println("1980");
    }
}

