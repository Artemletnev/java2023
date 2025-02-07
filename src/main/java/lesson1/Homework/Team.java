package lesson1.Homework;

public abstract class Team {



    void jump(Wall wall, Cat cat) {
        if (wall.getHight() > cat.getMaxHight()){
            System.out.println("Cat cant jump it");

        }
        else {
            System.out.println("Cat jump");
        }
    }






}
