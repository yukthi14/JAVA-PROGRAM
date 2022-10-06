interface AnimalEat
{
    void Eat();
}
interface AnimalTravels      //we need to implement both eat and travel
{
    void Travel();
}
class Animal implements AnimalEat,AnimalTravels
{
    public void Eat()
    {
        System.out.println("animal eating");
    }
    public void Travel()
    {
        System.out.println("animal travelling");
    }
}
public class INTERFACE
{
    public static void main(String[] args) {
        Animal a=new Animal();
        a.Eat();
        a.Travel();

    }
}
