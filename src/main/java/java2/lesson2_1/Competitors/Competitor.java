package java2.lesson2_1.Competitors;

public interface Competitor {
    void run (int dist);
    void swim(int dist);
    void jump(int height);
    boolean isOnDistant();
    void info();
}
