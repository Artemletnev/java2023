package java2.lesson2_1.Competitors;

public class Animal implements Competitor {
    String type;
    String name;

    int maxRunDistance;
    int maxSwimDisance;
    int maxJumpHeight;

    boolean onDistance;

    @Override
    public boolean isOnDistant() {
        return onDistance;
    }

    public Animal(String type, String name, int maxRunDistance, int maxSwimDisance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDisance = maxSwimDisance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if(dist <= maxRunDistance){
            System.out.println(type + " " + name + " did well with cross");
        } else {
            System.out.println(type + " " + name + " couldn't run");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if(dist<= maxSwimDisance){
            System.out.println(type + " " + name + " did well with swiming");
        } else {
            System.out.println(type + " " + name + " couldn't swim");
            onDistance=false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight){
            System.out.println(type + " " + name + " did well with jumping");
        } else {
            System.out.println(type + " " + name + " couldn't jump");
            onDistance = false;
        }
    }

    @Override
    public void info() {
        System.out.println(type + " " + name +": " + onDistance);
    }
}
