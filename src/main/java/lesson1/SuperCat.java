package lesson1;

public class SuperCat extends Cat{

    protected int power;

    public SuperCat(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    @Override
    void info() {
        System.out.println("Supercat " + name + " " +  age + " " + power);
    }
}
