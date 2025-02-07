package test;

public class App {
    public static void main(String[] args) {
        Fruit fruit = Fruit.APPLE;

        if(fruit.equals(Fruit.APPLE)){
            System.out.println("Fruit is really apple!");
        }
        switch (fruit){
            case APPLE:
                System.out.println("the apple");
                break;
            case BANANA:
                System.out.println("the banana");
                break;
            case CHERRY:
                System.out.println("the cherry");
                break;
            case ORANGE:
                System.out.println("the orange");
                break;
            default:
                System.out.println("is not a fruit");
        }

        System.out.println("All elements:");

        for (Fruit fruit1 : Fruit.values()){
            System.out.println(fruit1);
        }
        System.out.println("Searching for name: " + Fruit.valueOf("BANANA"));

        for (Fruit fruit1: Fruit.values()){
            System.out.println("Средний вес фрукта " + fruit1.getRussianTitle() + " составляет " + fruit1.getWeith());
        }

    }
}
