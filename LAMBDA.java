@FunctionalInterface
interface Lambaexp{
    void method1(int a,int b);
}


public class LAMBDA {

    public static void main(String[] args) {
    Lambaexp l=(a,b)->{
        System.out.println("the value a and b is:"+a+","+b);
    };
    l.method1(14,15);
    }
}
