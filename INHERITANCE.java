class circle{
    public int radius;
    circle()         //default constructor
    {
        System.out.println("i am a circle without parameter");
    }
    circle(int r)       //parameterized constructor
    {
        System.out.println("i am circle with parameter");
        this.radius=r;
    }
    public double area()
    {
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends circle
{
    public int height;

    cylinder(int r,int h)
    {
        super(r);    //inherits r from super class
        System.out.println("i am cylinder with parameter");
        this.height=h;
    }
    public double volume()
    {
        return Math.PI*this.radius*this.height;
    }
}
class triangle extends circle
{
    public int base;

    triangle(int r,int b)
    {
        super (r);
        System.out.println("i am triangle with parameter");
        this.base=b;
    }
    public double area()
    {
      return 0.5*this.radius*this.base;
    }
}




public class INHERITANCE
{
    public static void main(String[] args) {
   triangle obj=new triangle(12,4);
        //i am circle with parameter
        //i am triangle with parameter

   //cylinder objc=new cylinder(10 ,15);
           //i am circle with parameter
           //i am cylinder with parameter

        // circle obj=new circle();
       //i am a circle without parameter

    //circle obj=new circle(7);
    //i am circle with parameter
    }

}
