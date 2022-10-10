import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GREGORIAN_CALENDER {
    public static void main(String[] args) {
       GregorianCalendar gcal= new GregorianCalendar();
        System.out.println(gcal.isLeapYear(2024));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[14]);

    }
}
