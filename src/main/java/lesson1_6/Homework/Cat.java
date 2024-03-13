package lesson1_6.Homework;


public class Cat extends Animals {


    public Cat(String name,  String breed) {
        super(name,  breed);
        this.swim = false;
        this.maxRun = 200;
        this.run = true;
    }

    @Override
    public void swim(int n) {
        if (!swim) {
            System.out.println("The cat cant swiming");
            return;
        }
        if (n > maxSwim) {
            System.out.println("The cat cant swim " + n + " metr");

            return;
        }
        System.out.println("The cat swim " + n + " metr!");


    }

    @Override
    public void run(int n) {
        if (!run) {
            System.out.println("The cat cant running");

            return;
        }
        if (n > maxRun) {
            System.out.println("The cat cant run " + n + " metr");

            return;
        }
        System.out.println("The cat run " + n + " metr!");

    }
}
