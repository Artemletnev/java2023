package lesson1_6.Homework;

public class Dog extends Animals {
    public Dog(String name, int age, String breed) {
        super(name,  breed);
        this.maxRun = 500;
        this.maxSwim = 10;
        this.swim = true;
        this.run = true;
    }

    @Override
    public void swim(int n) {
        if (!swim) {
            System.out.println("The dog cant swiming");

            return;
        }
        if (n > maxSwim) {
            System.out.println("The dog cant swim " + n + " metr");

            return;
        }
        System.out.println("The dog swim " + n + " metr!");


    }

    @Override
    public void run(int n) {
        if (!run) {
            System.out.println("The dog cant running");

            return;
        }
        if (n > maxRun) {
            System.out.println("The dog cant run " + n + " metr");

            return;
        }
        System.out.println("The dog run " + n + " metr!");

    }
}
