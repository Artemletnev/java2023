package java2.lesson2_2;

public class Outer {
    private int outerVar;


    class Inner{
        private int innerVar;

        public Inner(int innerVar) {
            this.innerVar = innerVar;
        }
        void innerTest(){
            System.out.println("innerVar " + innerVar);
            System.out.println("outerVar " + outerVar );
        }



    }


    public Outer(int outerVar) {
        this.outerVar = outerVar;
    }
    public void outerTest(){
        //System.out.println("innerVar " + innerVar);
        System.out.println("outerVar " + outerVar );
    }



}
class TestOuerInner{
    public static void main(String[] args) {
        Outer outer = new Outer(10);
        Outer.Inner inner = new Outer(20).new Inner(15);
    }
}
