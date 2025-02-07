package java2.lesson2_1;

public class Wall extends Obstacle{
    int height;

    public Wall(int height) {
        height = height;
    }

    @Override
    public void doIT(Competitor competitor) {
        competitor.jump(height);
    }
}
