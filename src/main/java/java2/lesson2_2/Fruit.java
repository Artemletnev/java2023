package java2.lesson2_2;

public enum Fruit {


    ORANGE("Апельсин", 5), APPLE("Яблоко", 3), BANANA("Банан", 2), CHERRY("Вишня", 1);
    private String rus;
    private int weight;

    Fruit(String rus, int weight) {
        this.rus = rus;
        this.weight = weight;
    }


    public String getRus() {
        return rus;
    }

    public int getWeight() {
        return weight;
    }
}




class MainEnum {
    public static void main(String[] args) {
//        Fruit f = Fruit.CHERRY;
//
        for (Fruit fruit : Fruit.values()){
            System.out.println(fruit.getRus() + " " + fruit + " " + fruit.getWeight());
        }
//
//        System.out.println(Fruit.valueOf("BANANA"));
    }

}
