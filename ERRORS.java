import java.util.Scanner;

public class ERRORS
{
    public static void main(String[] args) {
        int a=10;  //if we miss semicolon then its syntax error
        System.out.println(a); //(a+b) is syntax error because we did not use b.
        //logical error
        //print prime number 1 to 5
        System.out.println(2);
        for(int i=1;i<5;i++){
            System.out.println(2*i*1);
        }
        //runtime error
        int i;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        System.out.println("integer part of 100 divide by i is"+100);
    }
}
