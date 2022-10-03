import java.util.*;
public class STACK
{
    int top;
    int size;
    int st[]=new int[10];
    STACK()
    {
        top=-1;
        size=4;
    }
    void push()
    {
        if(top==size-1)
        {
            System.out.println("stack overflow");
        }
        else
        {
            System.out.println("enter the elements to be inserted:");
            Scanner read=new Scanner(System.in);
            int item= read.nextInt();
            top=top+1;
            st[++top]=item;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack underflow");
        }
        else{
            System.out.println("element to be poped:"+st[top--]);
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("stack empty");
        }
        else{
            System.out.println("---stack contains---");
            for(int i=top;i>=0;i--)
            {
                System.out.println(st[i]);
            }
        }
    }
    public static void main (String[] args) {
        STACK ob=new STACK();
        Scanner read=new Scanner(System.in);
        for(;;)
        {
            System.out.println("1.push 2.pop 3.display 4.return");
            System.out.println("enter your choice:");
            int ch=read.nextInt();
            switch(ch)
            {
                case 1:ob.push();
                    break;
                case 2: ob.pop();
                    break;
                case 3: ob.display();
                    break;
                default: return;
            }
        }
    }
}
