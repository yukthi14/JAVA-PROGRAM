import java.util.Scanner;

public class STUDENT
{
    String usn;
    String name;
    String branch;
    long phno;
    int marks;
    void getdata()
    {
        Scanner read=new Scanner(System.in);
        System.out.println("enter usn:");
        usn=read.next();
        System.out.println("enter name:");
        name=read.next();
        System.out.println("enter branch:");
        branch=read.next();
        System.out.println("enter phone number:");
        phno=read.nextLong();
        System.out.println("enter the marks:");
        marks=read.nextInt();
    }
    void display()
    {
        System.out.println("student usn ="+usn);
        System.out.println("student name ="+name);
        System.out.println("student branch ="+branch);
        System.out.println("student phone number ="+phno);
        System.out.println("student marks ="+marks);
    }

    public static void main(String[] args)
    {
        STUDENT ob=new STUDENT();
        ob.getdata();
        System.out.println("-----student details-----");
        ob.display();

    }
}
