interface camera
{
    void takepic();
    void recvideo();
}

interface wifi
{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class cellphone
{
    void callnumber(int phonenumber)
    {
        System.out.println("calling"+phonenumber);
    }
    void pickcall()
    {
        System.out.println("connecting...");
    }

}
class smartphone1 extends cellphone implements camera,wifi
{
    public void takepic()
    {
        System.out.println("taking picture");
    }

    @Override
    public void recvideo()
    {
        System.out.println("shooting video");
    }

    public String[] getNetwork()
    {
        System.out.println("getting lists of network");
        String[] networklist={"yukthi5G","vishwajeet5G","yuvi4G"};
        return networklist;
    }

    @Override
    public void connectToNetwork(String network) {

    }

    public void connecttonetwork(String network)
    {
        System.out.println("connecting to"+network);
    }
}
public class INTERFACE_1 {
    public static void main(String[] args) {
        smartphone1 obj =new smartphone1();
        obj.recvideo();
        String[]arr=obj.getNetwork();
        for(String item:arr)
        {
            System.out.println(item);
        }
    }
}
