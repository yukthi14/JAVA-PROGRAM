import java.util.Calendar;
import java.util.TimeZone;

public class CALENDER_CLASS {
    public static void main(String[] args) {
       // Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        //System.out.println(c.getCalendarType());
       // System.out.println(c.getTimeZone().getID());

        Calendar c = Calendar.getInstance();
        System.out.println("Current date is : " + c.getTime());
        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ c.getTime());
        c.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ c.getTime());



    }
}



