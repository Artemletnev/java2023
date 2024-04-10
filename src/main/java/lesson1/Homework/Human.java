package lesson1.Homework;

public class Human extends Team{
    private int maxDistance;
    private int maxHight;

    private boolean canJump;
    private boolean canSwim;
    private boolean canRun;
    private String name;

    public Human( String name) {
        this.maxDistance = 150;
        this.maxHight = 80;
        this.canJump = true;
        this.canSwim = true;
        this.canRun = true;
        this.name = name;
    }
    @Override
    void run(){
        if(canRun){
            System.out.println("The human " + name + " " + "is running");
        }
        else {
            System.out.println("The cant running");
        }

    }
    @Override
    void jump(){
        if(canJump){
            System.out.println("The human " + name + " " + "is jump");
        }
        else {
            System.out.println("The cant jump");
        }

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
