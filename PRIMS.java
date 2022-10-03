import java.util.Scanner;
public class PRIMS
{
    int ne,sum,n;
    int dist[][]=new int[10][10];

    int parent[]=new int[10];
    void getdata()
    {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter no. of nodes ");
        n=read.nextInt();
        System.out.println("Enter distance matrix ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                dist[i][j]=read.nextInt();
            }
        }
    }
    void mst()
    {
        int u=0,v=0,min;
        ne=0;sum=0;
        for(int i=0;i<n;i++)
        {
            parent[i]=0;
        }
        parent[0]=1;
        while(ne!=n-1)
        {
            min=999;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(dist[i][j]<min && parent[i]==1 && parent[j]==0)
                    {
                        min=dist[i][j];
                        u=i;
                        v=j;
                    }
                }
            }
            System.out.println("Connect "+u+"-->"+v);
            ne++;
            sum=sum+dist[u][v];
            parent[v]=1;
        }
        System.out.println("MST = "+sum);
    }
    public static void main(String[] args)
    {
        PRIMS ob=new PRIMS();
        ob.getdata();
        ob.mst();
    }
}
