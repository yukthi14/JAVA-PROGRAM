public class TRY_CATCH {
    public static void main(String[] args) {
        int a=400;
        int b=0;
        try{
            int c=a/b;
            System.out.println("the result is"+c);
        }
        catch(Exception e){
            System.out.println("failed to divide,its an arithmatic error");  //user can specify what kind of error to be displayed
            System.out.println(e);
        }
    }
}
