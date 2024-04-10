package lesson1.Homework;

public class Robot {
    private int maxDistance;
    private int maxHight;

    private boolean canJump;
    private boolean canSwim;
    private boolean canRun;
    private String name;

    public Robot( String name) {
        this.maxDistance = 300;
        this.maxHight = 120;
        this.canJump = true;
        this.canSwim = true;
        this.canRun = true;
        this.name = name;
    }
    void run(){
        if(canRun){
            System.out.println("The robot " + name + " " + "is running");
        }
        else {
            System.out.println("The cant running");
        }

    }
    void jump(){
        if(canJump){
            System.out.println("The robot " + name + " " + "is jump");
        }
        else {
            System.out.println("The cant jump");
        }

    }
}
