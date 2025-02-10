package java2.lesson2_1;

import java2.lesson2_1.Competitors.*;
import java2.lesson2_1.Obstacle.*;

public class Main {
    public static void main(String[] args) {
//        Competitor[] competitors = {new Human("Bob"), new Dog("Ray"), new Cat("Bars")};
//        java2.lesson2_1.Obstacle.Obstacle[] course = {new Cross(70), new Wall(2), new Water(20)};
//
//        for (Competitor c : competitors){
//            for (java2.lesson2_1.Obstacle.Obstacle o : course){
//                o.doIT(c);
//                if (!c.isOnDistant())break;
//            }
//        }
//        for (Competitor c :competitors){
//            c.info();
//        }
        Team team = new Team("Winners", new Cat("Bars"), new Dog("Ray"), new Human("Artem"), new Human("Nataly"));
        Course course = new Course(new Cross(80), new Wall(2), new Wall(1), new Water(7));
        course.doIT(team);
        team.showWinners();








        //c.dolt(team); //команда пройти полосу препятствий
       // team.showResults(); // результаты забега

    }


}
