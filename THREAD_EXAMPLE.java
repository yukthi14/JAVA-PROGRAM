class thread_example extends Thread{
    public void run(){
       while(true){
           System.out.println("good morning");
       }
    }
}
class thread_exampleb extends Thread{
    public void run(){
        //while(true){
       //     try {
        //Thread.sleep(200);
           // }
            //  catch(Exception e){
         //       System.out.println(e);
         //   }
         //   System.out.println("good night");
        }


    }


public class THREAD_EXAMPLE {
    public static void main(String[] args) {
        thread_exampleb e1=new thread_exampleb();

        thread_exampleb e2=new thread_exampleb();
       // e1.setPriority(1);
       // e2.setPriority(10);
       System.out.println(e1.getPriority());
        System.out.println(e2.getPriority());
       // e1.start();

      e2.start();
        System.out.println(e2.getState());
        //current state
        System.out.println(Thread.currentThread().getState());
    }
}
