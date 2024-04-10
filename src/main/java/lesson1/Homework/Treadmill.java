package lesson1.Homework;

public class Treadmill extends Course {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }


    void catRun(Cat cat) {
        if (distance > cat.getMaxDistance()) {
            System.out.println("Cat " + cat.getName() + " cant do this!");
        } else {
            cat.run();
        }
    }

    void humanRun(Human human) {
        if (distance > human.getMaxDistance()) {
            System.out.println("Human " + human.getName() + " cant do this!");
        } else {
            human.run();
        }
    }
}
