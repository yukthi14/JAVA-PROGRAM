import java.util.Random;
import java.util.Scanner;
import java.sql.SQLOutput;

public class QUICKSORT
{
    public static void divide(int a[],int low,int high)
    {
        if(low<high)
        {
            int j= parition(a,low,high);
            divide(a,low,j-1);
            divide(a,j+1,high);

        }
    }
    public static int parition(int a[], int low,int high)
    {
        int i=low+1,j=high,pivot=a[low];
        while( i<=j)
        {
            while (a[i] <= pivot) i++;
            while (a[j] > pivot) j--;
            if (i <= j)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j]=temp;
            }

        }
        int temp=a[low];
        a[low]=a[j];
        a[j] = temp;
        return j;
    }
    public static void main(String[] args) {
        int a[] = new int[10000];
        int n, i;
        Scanner read = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("random entered number:");
        n = read.nextInt(14);
        for (i = 0; i < n; i++)
        {
            a[i] = rand.nextInt(n);
            System.out.print(" "+a[i]);
        }
        long st = System.currentTimeMillis();
        divide(a, 0, n - 1);
        long et = System.currentTimeMillis();
        System.out.println("----sorted list-----");
        for (i = 0; i < n; i++)
        {
            System.out.print(" " + a[i]);
        }

        System.out.println("time taken:" + (et - st));
    }

}
