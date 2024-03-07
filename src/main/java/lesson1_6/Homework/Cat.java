package lesson1_6.Homework;


public class Cat extends Animals {


    public Cat(String name, int age, String breed) {
        super(name, age, breed);
        this.swim = false;
        this.maxRun = 200;
        this.run = true;
    }

    @Override
    public void swim(int n) {
        if (!swim) {
            System.out.println("The cat cant swiming");
            catCount++;
            return;
        }
        if (n > maxSwim) {
            System.out.println("The cat cant swim " + n + " metr");
            catCount++;
            return;
        }
        System.out.println("The cat swim " + n + " metr!");
        catCount++;

    }

    @Override
    public void run(int n) {
        if (!run) {
            System.out.println("The cat cant running");
            catCount++;
            return;
        }
        if (n > maxRun) {
            System.out.println("The cat cant run " + n + " metr");
            catCount++;
            return;
        }
        System.out.println("The cat run " + n + " metr!");
        catCount++;
    }
}
