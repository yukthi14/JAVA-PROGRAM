import java.util.Scanner;

public class EXCEPTION_EX {
    public static void main(String[] args) {
        boolean flag=true;
        int marks[]=new int[5];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        marks[3]=40;
        marks[4]=50;
        Scanner sc=new Scanner(System.in);
        int index;
        int i=0;
        while(flag && i<4){
            try{
                System.out.println("enter the value of index:");
                index=sc.nextInt();
                System.out.println("the value of marks[index]"+marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("invaild choice");
                i++;
            }

        }
        if(i>=4)
        {
            System.out.println("error");
        }
    }
}
