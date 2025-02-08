package java2.lesson2_1.Obstacle;

import java2.lesson2_1.Competitors.Competitor;
import java2.lesson2_1.Obstacle.Obstacle;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        height = height;
    }

    @Override
    public void doIT(Competitor competitor) {
        competitor.jump(height);
    }
}
