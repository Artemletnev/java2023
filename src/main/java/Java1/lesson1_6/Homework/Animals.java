package Java1.lesson1_6.Homework;

public class Animals {
    protected boolean swim;
    protected boolean run;
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected String breed;


    public Animals(String name,  String breed) {
        this.name = name;

        this.breed = breed;
    }

    public void swim(int n) {
        if (!swim) {
            System.out.println("The animal cant swiming");
            return;
        }
        if (n > maxSwim) {
            System.out.println("The animal cant swim " + n + " metr");
            return;
        }
        System.out.println("The animal swim " + n + " metr!");


    }

    public void run(int n) {
        if (!run) {
            System.out.println("The animal cant running");
            return;
        }
        if (n > maxRun) {
            System.out.println("The animal cant run " + n + " metr");
            return;
        }
        System.out.println("The animal run " + n + " metr!");

    }


}