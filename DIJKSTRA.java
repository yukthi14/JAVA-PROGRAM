import java.util.Scanner;

import static java.lang.Math.min;

public class DIJKSTRA
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
        Scanner read=new Scanner(System.in);
        System.out.println("enter source");
        int source=read.nextInt();
        System.out.println("----shortest path for given source----");
        for(int i=0;i<n;i++)
        {
            System.out.println(source+"---->"+i+"="+dist[source][i]);
        }
    }

    public static void main(String[] args)
    {
        DIJKSTRA ob=new DIJKSTRA();
        ob.getdata();
        ob.shortest();
        ob.display();
    }
}


