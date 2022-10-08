import java.util.Scanner;

public class MULTIPLE_CATCH {
    public static void main(String[] args) {
        int marks[]=new int[3];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array index=");
        int index=sc.nextInt();
        System.out.println("enter the number you want to divide with=");
        int number=sc.nextInt();
        try{
            System.out.println("value of array index entered is:"+marks[index]);
            System.out.println("value of array value is"+marks[index]/number);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array out of exception occured!!!");

            System.out.println(e);

        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception occured!!" );
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some kind of error occurred");
            System.out.println(e);
        }
    }
}
