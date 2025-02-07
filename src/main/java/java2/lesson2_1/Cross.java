package java2.lesson2_1;

public class Cross extends Obstacle{
    int leight;

    public Cross(int leight) {
        this.leight = leight;
    }

    @Override
    public void doIT(Competitor competitor) {
        competitor.run(leight);
    }
}

