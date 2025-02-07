package Lesson1var2;

public class main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bars","white", 2, 4);

        Cat cat2 = new Cat("Vong","Black", 4,4);

        Cat cat3 = new Cat("Tototro");


        Cat[] cats = new Cat[2];
        //cat1.putMeInArray(cats,0);
        //cat2.putMeInArray(cats,1);
        //Cat.sayMe();

        //cat1.animalInfo();

        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode());







    }
}
