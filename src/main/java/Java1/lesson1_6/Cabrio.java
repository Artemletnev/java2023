package Java1.lesson1_6;

public class Cabrio extends Car{
    boolean hasHardTop;

    public Cabrio(String model, int year, boolean hasRoof) {
        super(year, model);
        this.hasHardTop = hasRoof;
    }
    public boolean isHasHardTop() {
        return hasHardTop;
    }

    public void setHasHardTop(boolean hasHardTop) {
        this.hasHardTop = hasHardTop;
    }

    @Override
    void printName() {
        super.printName();
    }
}
