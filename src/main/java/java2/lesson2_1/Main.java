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
        Competitor[] competitors = {new Human("BOB"), new Cat("Bars"), new Dog("Ray")};
        Obstacle[] obstacles = {new Cross(400), new Water(1), new Wall(2)};

        Team team = new Team("Winners", competitors);
        System.out.println("Create new team");
        System.out.println(team.getTeamName());
        System.out.println("TEam members:");
        team.showResults();

        Course course = new Course(obstacles);
        course.doIT(team);
        team.showResults();
        team.showMembersFinishedCourse();





        //c.dolt(team); //команда пройти полосу препятствий
       // team.showResults(); // результаты забега

    }


}
