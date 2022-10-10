import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class JAVA_TIME {
    public static void main(String[] args) {
        LocalDate d= LocalDate.now();
        System.out.println(d);

        LocalTime t= LocalTime.now();
        System.out.println(t);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        LocalTime t1=LocalTime.of(14,2,19);
        System.out.println("time before:"+t1);

        LocalTime t2=t1.minusMinutes(4);
        System.out.println("time after subtracting 4 minutes:"+t2);


    }
}
