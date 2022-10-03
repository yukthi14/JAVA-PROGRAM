import java.util.*;
public class KNAPSACKD
{
    int n,m;
    int w[]=new int[10];
    int p[]=new int [10];
    int v[][]=new int [10][10];
    void getdata()
    {
        Scanner read=new Scanner(System.in);
        System.out.println("enter the item:");
        n=read.nextInt();
        System.out.println("enter maximum capacity:");
        m=read.nextInt();
        System.out.println("enter the weight:");
        for(int i=1;i<=n;i++)
        {
            w[i]=read.nextInt();
        }
        System.out.println("enter profit:");
        for(int i=1;i<=n;i++)
        {
            p[i]=read.nextInt();

        }
    }
    int max(int x,int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    void optimal()
    {

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0||j==0)
                    v[i][j]=0;
                else if(w[i]>j)
                {
                    v[i][i]=v[i-1][j];
                }
                else
                    v[i][j]=max(v[i-1][j],p[i]+v[i-1][j-w[i]]);
            }
        }
    }

    void display()
    {
        System.out.println("----optimal solution-----");
        for(int i=0;i<=n;i++)
        {
            for (int j=0;j<=m;j++)
            {
                System.out.print(" "+v[i][j]);
            }
            System.out.println();
        }
        System.out.println("optimal solution:"+v[n][m]);
    }
    public static void main (String[] args) {
        KNAPSACKD ob=new KNAPSACKD ();
        ob.getdata();
        ob.optimal();
        ob.display();
    }
}