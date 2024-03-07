package lesson1_6.Homework;

public class Dog extends Animals {
    public Dog(String name, int age, String breed) {
        super(name, age, breed);
        this.maxRun = 500;
        this.maxSwim = 10;
        this.swim = true;
        this.run = true;
    }

    @Override
    public void swim(int n) {
        if (!swim) {
            System.out.println("The dog cant swiming");
            dogCount++;
            return;
        }
        if (n > maxSwim) {
            System.out.println("The dog cant swim " + n + " metr");
            dogCount++;
            return;
        }
        System.out.println("The dog swim " + n + " metr!");
        dogCount++;

    }

    @Override
    public void run(int n) {
        if (!run) {
            System.out.println("The dog cant running");
            dogCount++;
            return;
        }
        if (n > maxRun) {
            System.out.println("The dog cant run " + n + " metr");
            dogCount++;
            return;
        }
        System.out.println("The dog run " + n + " metr!");
        dogCount++;
    }
}
