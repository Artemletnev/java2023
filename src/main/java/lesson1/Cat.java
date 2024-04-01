package lesson1;

public class Cat extends Animals{
    protected int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    void info() {
        System.out.println("Cat " + name + " " + age);
    }

    @Override
    void calc() {
        System.out.println("123123");

    }
}
