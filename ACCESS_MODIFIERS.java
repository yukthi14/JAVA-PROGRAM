class c
{
    public int x=10;
    protected int y=15;
    int z=20;
    private int a=30;
    public void same()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class ACCESS_MODIFIERS {
    public static void main(String[] args) {
        c obj=new c();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        //System.out.println(obj.a); ----error in same package, private cannot be accessed
        //---in subclass default and private cannot be accessed
        //---outside the package we can use only public

        //access modifier    class     package   subclass   world
        //public               y           y         y        y
        //protected            y            y        y        n
        //default              y            y        n        n
        //private              y            n        n        n
    }
}
