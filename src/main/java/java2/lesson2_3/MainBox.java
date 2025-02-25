package java2.lesson2_3;

public class MainBox {
    public static void main(String[] args) {
        Box b1 =new Box("white", 1);
        Box b2 =new Box("white", 1);
        int a = 1;
        int b = 1;



        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b1.equals(b2));
    }

}
