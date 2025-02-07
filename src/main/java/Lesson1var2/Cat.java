package Lesson1var2;

public class Cat extends Animal {

    int paws;


    public Cat(String name, String color, int age, int paws) {

        this.name = name;
        this.age = age;
        this.color = color;
        this.paws = paws;
    }

    public Cat(String name) {
        this.age = 4;
        this.name = name;
        this.color = "Yellow";
        this.paws = 4;
    }


    public void putMeInArray(Cat[] cats, int arrayIndex) {
        cats[arrayIndex] = this;
    }

    protected static void sayMe() {
        System.out.println("Hello");
    }

    public String toString() {
        return "Cat: " + name;
    }

    public int hashCode() {
        return name.hashCode() + age * 71;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o==null||getClass() != o.getClass()){
            return false;
        }
        Cat another =(Cat) o;
        return this.age == another.age && this.name.equals(another.name);
    }

    @Override
    void say() {
        System.out.println("Cat says myo");
    }
}
