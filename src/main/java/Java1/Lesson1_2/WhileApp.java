package Java1.Lesson1_2;

public class WhileApp {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {// может не вызваться если условия не подходят
            if (i % 2 == 0){
                i--;
                continue;
            }
            System.out.println(i);
            i--;
        }
        System.out.println();
        int j = -10;
        do {// первый цикл вызывается в любом случае
            System.out.println("j = " + j);
            j--;
        } while (j > 0);
    }
}
