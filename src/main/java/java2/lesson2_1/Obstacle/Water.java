package java2.lesson2_1.Obstacle;

import java2.lesson2_1.Competitors.Competitor;
import java2.lesson2_1.Obstacle.Obstacle;

public class Water extends Obstacle {
    int leight;

    public Water(int leight) {
        this.leight = leight;
    }

    @Override
    public void doIT(Competitor competitor) {
        competitor.swim(leight);
    }
}
