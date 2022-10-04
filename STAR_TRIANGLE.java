public class STAR_TRIANGLE
{
    public static void main(String[] args)
    {
        int number=10;
        int a,b;
        for(a=1;a<=number;a++)
        {
            for(b=1;b<a;b++)
            {
                System.out.print("");
            }
            for(b=a;b<=number;b++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(a=number-1;a>=0;a--)
        {
            for(b=0;b<a;b++)
            {
                System.out.print("");
            }
            for(b=a;b<=number-1;b++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }


}
