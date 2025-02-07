package java2.lesson2_1;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Bob"), new Dog("Ray"), new Cat("Bars")};
        Obstacle[] course = {new Cross(70), new Wall(2), new Water(20)};

        for (Competitor c : competitors){
            for (Obstacle o : course){
                o.doIT(c);
                if (!c.isOnDistant())break;
            }
        }
        for (Competitor c :competitors){
            c.info();
        }
    }


}
