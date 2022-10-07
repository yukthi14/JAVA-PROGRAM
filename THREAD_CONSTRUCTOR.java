class myth extends Thread{
    public myth(String name){
        super(name);
    }
    public void run(){
        int i=45;
        System.out.println("hi");
       // while(true)
            //System.out.println("i am a thread");
        }
    }


public class THREAD_CONSTRUCTOR {
    public static void main(String[] args) {
        myth t=new myth("yukthi");
        myth t1=new myth("achar");
        t.start();
        System.out.println("the id of the thread i is:"+t.getId());
        System.out.println("the name of the thread i is:"+t.getName());
        System.out.println("the id of the thread i is:"+t1.getId());
        System.out.println("the name of the thread i is:"+t1.getName());
    }
}
