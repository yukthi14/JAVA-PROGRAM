public class pattern
{
    static void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {                           //if i+3 then it starts from 3 stars printing
                //for reverse order j<n-1{
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern(7);
    }
}
