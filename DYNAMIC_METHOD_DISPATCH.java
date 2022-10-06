class phone
{
    public void name()
    {
        System.out.println("samsung keytype");
    }
    public void model()
    {
        System.out.println("200xp");
    }
}
class smartphone extends phone
{
    public void name()
    {
        System.out.println("redmi");
    }
    public void model()
    {
        System.out.println("pro 13");
    }
}


public class DYNAMIC_METHOD_DISPATCH
{
    public static void main(String[] args) {
      phone obj=new smartphone(); //it is allowed,reverse not possible.
      obj.name();
      obj.model();
      //obj will run , not the referance
        //her smartphone is obj,phone is ref
        //know as run time, because obj is created during run time.

        //phone obj=new phone();
        //normally we do this clearly its obj of phone not smartphone
    }

}
