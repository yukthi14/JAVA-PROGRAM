abstract class parent{
    public parent(){
        System.out.println("i am constructor of base");
    }
    public void hello(){
        System.out.println("hi");
    }
    abstract public void greet();
    abstract public void greet1();
}
class base extends parent{
    public void greet(){
        System.out.println("good morning");
    }
    public void greet1(){
        System.out.println("good afternoon");
    }
}
abstract class base1 extends parent{
    public void thought()
    {
        System.out.println("i am fine");
    }
}
public class ABSTRACT
{
    public static void main(String[] args) {
        base b=new base();
        //parent p=new parent(); ----->error
        //base1 b1=new base1(); ------>error
    }
}
