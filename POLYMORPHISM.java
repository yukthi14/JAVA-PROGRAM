class Monkey
{
    void jump()
    {
        System.out.println("jumping..");
    }
    void bite()
    {
        System.out.println("biting....");
    }
}
interface BasicAnimal
{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal
{
    void speak()
    {
        System.out.println(" hi!!! how r u?");
    }
    public void eat()
    {
        System.out.println("eating...");
    }
    public void sleep()
    {
        System.out.println("sleeping...");
    }
}

public class POLYMORPHISM {
    public static void main(String[] args) {
      //  Human obj=new Human();  //simple--direct
      //  obj.sleep();
       // obj.eat();

        Monkey m=new Human();
        //m.speak();//------>error
        m.jump();//----->it will execute
        m.bite();//----->it will execute
    }
}
