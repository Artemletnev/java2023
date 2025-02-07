package solo;

public class Company {
    private String name;
    private int debt;
    private int payd;

    static int count;

    private int mustGet;


    public Company(String name, int debt, int payd) {
        this.name = name;
        this.debt = debt;
        this.payd = payd;
        count++;
    }


    public void setMustGet(int mustGet) {
        this.mustGet = mustGet;
    }

    public int getMustGet() {
        return mustGet;
    }

    void info() {
        System.out.println("Компания друзей " + name + " потратила на вечеринку " + payd + " и была должна с прошлой вечеринки " + debt);
    }

    void calcTotalPayed(int x, int y) {
        int total = x + y;
        System.out.println("Вечеринка обошлась в " + total + " рублей");
    }

    public String getName() {
        return name;
    }

    public int getDebt() {
        return debt;
    }

    public int getPayd() {
        return payd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public void setPayd(int payd) {
        this.payd = payd;
    }

    public static void setCount(int count) {
        Company.count = count;
    }
}
