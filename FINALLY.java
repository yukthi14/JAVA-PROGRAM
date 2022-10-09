public class FINALLY {
    public static void main(String[] args) {
        try{
            int a=25/5;
            System.out.println(a);
        }
        catch(NullPointerException e)  //when a variable is accessed which is not pointing to any object and refers to nothing or null.
        {
            System.out.println(e);
        }
        finally{
            System.out.println("what ever is written in finally block will be executed");
        }
        System.out.println("rest of the code");
    }
}
// in some case if u want to execute some statement the finally block can be used