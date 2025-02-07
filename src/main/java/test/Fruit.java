package test;

public enum Fruit {
    ORANGE("Апельсин", 4), APPLE("Яблоко", 2), BANANA("Банан", 3), CHERRY("Вишня", 5);
    private String russianTitle;
    private int weith;

    public String getRussianTitle(){
        return russianTitle;
    }
    public int getWeith(){
        return weith;
    }
    Fruit(String russianTitle, int weith){
        this.russianTitle = russianTitle;
        this.weith = weith;
    }
}
