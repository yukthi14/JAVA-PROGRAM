import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class MERGESORT
{
    public static void divide(int a[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            divide(a,low,mid);
            divide(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void merge(int a[],int low, int mid,int high)
    {
        int temp []=new int[10000];
        int i=low,j=mid+1,k=low;
        while(i<=mid&&j<=high)
        {
            if(a[i]<a[j])
            {
                temp[k++]=a[i++];
            }
            else
            {
                temp[k++]=a[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++]=a[i++];
        }
        while(j<=high)
        {
            temp[k++]=a[j++];
        }
        for(k = low;k<=high;k++)
        {
            a[k]=temp[k];
        }
    }

    public static void main(String[] args)
    {
        int a[]=new int[10000];
        int n,i;
        Scanner read=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("enter n");
        n=read.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=rand.nextInt(n);
            System.out.print(" "+a[i]);
        }
        long st=System.currentTimeMillis();
        divide(a,0,n-1);
        long et=System.currentTimeMillis();
        System.out.println("----sorted list-----");
        for(i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);

        }
        System.out.println("time taken:"+(et-st));

    }

}