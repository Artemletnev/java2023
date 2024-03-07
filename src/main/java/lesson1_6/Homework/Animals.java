package lesson1_6.Homework;

public class Animals {
    protected boolean swim;
    protected boolean run;
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected int age;
    protected String breed;
    public int catCount;
    public int dogCount;
    private int allAnimalsCount;

    public Animals(String name, int age, String breed) {
        this.name = name;
        this.age = age;
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
    public void printCounts(){
        System.out.println(catCount);
        System.out.println(dogCount);
        allAnimalsCount = catCount +dogCount;
        System.out.println(allAnimalsCount);
    }

}