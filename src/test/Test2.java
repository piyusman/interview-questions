package test;

public class Test2 {

    private int a;
    private int b;
    private int c;

    Test2(int a , int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static void main(String args[]){
       Test2 test2 = new Test2(5,4,3);
       System.out.println("Test2 " + test2.a + test2.b);
    }
}
