package Java1.lesson1_7.Homework.Simple_from_Methodick;

public class CAt {
    private String name;
    private int appetite;
    private boolean satiety;

    public CAt(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            satiety = true;
        }


    }

    ;

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public void info(CAt a){
        System.out.println("The cat " + name + " have satiety " + satiety);
    }
}
