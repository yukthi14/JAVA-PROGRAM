import java.util.Scanner;

import static java.lang.Math.min;

public class FLOYD
{
    int n;
    int dist[][]=new int[10][10];
    void getdata()
    {
        Scanner read=new Scanner(System.in);
        System.out.println("enter number of nodes");
        n=read.nextInt();
        System.out.println("enter distance matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                dist[i][j]=read.nextInt();
            }
        }
    }
    void shortest()
    {
        for(int k=0;k<n;k++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    dist[i][j]=min(dist[i][j],dist[i][k]+dist[k][j]);
                }
            }
        }
    }
    int min(int x, int y)
    {
        if(x<y) return x;
        else
            return y;
    }
    void display()
    {
        System.out.println("----all pair shortest path----");
        for(int i=0;i<n;i++)
        {
            for( int j=0;j<n;j++)
            {
                System.out.print("  "+dist[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        FLOYD ob=new FLOYD();
        ob.getdata();
        ob.shortest();
        ob.display();
    }
}
