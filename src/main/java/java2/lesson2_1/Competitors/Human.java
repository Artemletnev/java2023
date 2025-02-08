package java2.lesson2_1.Competitors;

import java2.lesson2_1.Competitors.Competitor;

public class Human implements Competitor {
    String name;
    int maxRunDistance;
    int maxSwimDisance;
    int maxJumpHeight;

    boolean active;

    @Override
    public boolean isOnDistant() {
        return active;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxSwimDisance = 200;
        this.maxJumpHeight = 30;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if(dist <= maxRunDistance){
            System.out.println(name + " did well with cross");
        } else {
            System.out.println(name + " couldn't run");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if(dist<= maxSwimDisance){
            System.out.println(name + " did well with swiming");
        } else {
            System.out.println(name + " couldn't swim");
            active =false;
        }

    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight){
            System.out.println(name + " did well with jumping");
        } else {
            System.out.println(name + " couldn't jump");
            active = false;
        }

    }

    @Override
    public void info() {
        System.out.println(name + ": " + active);

    }
}
