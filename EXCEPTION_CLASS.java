import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "i am a toString()";
    }
    public String getMessage(){
        return "i am getMessage()";
    }
}
public class EXCEPTION_CLASS {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
    }
}