package java2.lesson2_1.Obstacle;

import java2.lesson2_1.Competitors.Competitor;
import java2.lesson2_1.Obstacle.Obstacle;

public class Cross extends Obstacle {
    int leight;

    public Cross(int leight) {
        this.leight = leight;
    }

    @Override
    public void doIT(Competitor competitor) {
        competitor.run(leight);
    }
}

