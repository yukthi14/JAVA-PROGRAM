
public class multiplication_table
{
    static void multiplication ( int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.format("%d X %d = %d\n", n, i, n*i);
            // format can be used for calender , pi value

        }
    }
    public static void main(String[] args) {
        multiplication(14);

    }

}
// Calendar c = Calendar.getInstance();
//  System.out.format("%tB %te, %tY%n", c, c, c);  -->  "May 29, 2006"

//    System.out.format("%tl:%tM %tp%n", c, c, c);   -->  "2:34 am"

//   System.out.format("%tD%n", c);    -->  "05/29/06"