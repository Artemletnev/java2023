package lesson1.Homework;

public class Cat extends Team{
    private int maxDistance;
    private int maxHight;

    private boolean canJump;
    private boolean canSwim;
    private boolean canRun;
    private String name;

    public Cat(String name) {
        this.maxDistance = 20;
        this.maxHight = 10;
        this.canJump = true;
        this.canSwim = false;
        this.canRun = true;
        this.name = name;
    }


    public int getMaxDistance() {
        return maxDistance;
    }

    public int getMaxHight() {
        return maxHight;
    }

    public boolean isCanJump() {
        return canJump;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public boolean isCanRun() {
        return canRun;
    }

    public String getName() {
        return name;
    }


}
