package java2.lesson2_1.Obstacle;

import java2.lesson2_1.Competitors.Competitor;
import java2.lesson2_1.Competitors.Team;

public class Course {
    Obstacle[] obstacle;


    public Course(Obstacle[] obstacle) {
        this.obstacle = obstacle;
    }


    public void doIT(Team team){
        Competitor[] teammeMembers = team.getTeamMembers();
        if (teammeMembers.length>0){
            for (Competitor competitor : teammeMembers){
                for (Obstacle obstacle1 : obstacle){
                    obstacle1.doIT(competitor);
                    if (!competitor.isOnDistant())break;
                }
            }
        } else {
            System.out.println("There are no members in the team!");
        }
    }
}
