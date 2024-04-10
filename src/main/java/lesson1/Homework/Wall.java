package lesson1.Homework;

public class Wall extends Course {
    private int hight;


    public Wall(int hight) {
        this.hight = hight;
    }

    void catJump(Cat cat){
        if(hight> cat.getMaxHight()){
            System.out.println("Cat " + cat.getName()+ " cant do this!");
        }
        else {
            cat.jump();
        }
    }
    void humanJump(Human human){
        if(hight> human.getMaxHight()){
            System.out.println("Human " + human.getName()+ " cant do this!");
        }
        else {
            human.jump();
        }
    }


}
