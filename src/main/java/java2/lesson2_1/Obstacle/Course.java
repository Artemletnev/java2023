package java2.lesson2_1.Obstacle;

import java2.lesson2_1.Competitors.Competitor;
import java2.lesson2_1.Competitors.Team;

public class Course {
    private Obstacle[] obstacles;


    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }



    public void doIT(Team team){
        for (Competitor competitor : team.getTeams()){
            for (Obstacle obstacle : obstacles){
                obstacle.doIT(competitor);
                if (!competitor.isOnDistant())break;
            }
        }
    }
}
