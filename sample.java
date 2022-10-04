import java.sql.SQLOutput;

class A
 {
     public int a;



     public void meth1()
     {
         System.out.println("i am a class of A");
     }

 }
 class B extends A{
    public void meth1()
    {
        System.out.println("i am method 2 of class B");
    }
    public void meth2() {
        System.out.println("i am method 3 of class B");
    }
public class sample
{
    public static void main(String[] args) {
        A a=new A();
        a.meth1();
        B b=new B();
        b.meth2();
    }
}

