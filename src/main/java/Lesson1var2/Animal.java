package Lesson1var2;

public abstract class Animal {
    String name;
    int age;
    String color;


    public void animalInfo(){
        System.out.println("Животное " + name + " в возрасте " + age + "." + " Цвет = " + color );
    }
    abstract void say();

}
