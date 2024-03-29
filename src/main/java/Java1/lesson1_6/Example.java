package Java1.lesson1_6;


// Всегда a+b= total
public class Example {
    private int a;
    private int b;
    //private int total;

    public Example(int a, int b){
        this.a = a;
        this.b = b;
       // this.total = a+b;
    }
    public void info(){
        System.out.println(a+ " + " + b + " = " + (a+b));
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

//    public int getTotal() {
//        return total;
//    }

    public void setA(int a) {
        this.a = a;
       // this.total = this.a +this.b;
    }

    public void setB(int b) {
        this.b = b;
        //this.total = this.a +this.b;
    }


}
