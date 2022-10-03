import java.util.*;

class STAFF

{
    String id;
    String name;
    long phone;
    double salary;
    void getdata()
    {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter staff id");
        id=read.next();
        System.out.println("Enter name");
        name=read.next();
        System.out.println("Enter phone number");
        phone=read.nextLong();
        System.out.println("Enter salary");
        salary=read.nextDouble();
    }
    void display()
    {
        System.out.println("Staff id="+id);
        System.out.println("Staff name="+name);
        System.out.println("Staff phone number="+phone);
        System.out.println("Staff salary="+salary);
    }
}
class TEACHING extends STAFF
{
    String domain;
    int publication;
    void getdata()
    {
        super.getdata();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter teaching domain");
        domain=read.next();
        System.out.println("Enter number of research publication");
        publication=read.nextInt();
    }
    void display()
    {
        System.out.println("__Teaching Employ Details");
        super.display();
        System.out.println("Teaching domain="+domain);
        System.out.println("Research Publication="+publication);
    }
}
class TECHNICAL extends STAFF
{
    String skill;
    void getdata()
    {
        super.getdata();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Technical Skill");
        skill=read.next();
    }
    void display()
    {
        System.out.println("_TECHNICAL SKILLS_");
        super.display();
        System.out.println("TECHNICAL SKILLS="+skill);
    }
}
public class EMPLOYEE
{
    public static void main(String args[])
    {
        TEACHING ob1 = new TEACHING();
        TECHNICAL ob2 = new TECHNICAL();
        ob1.getdata();
        ob2.getdata();
        ob1.display();
        ob2.display();
    }
}