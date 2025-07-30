import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        
        Date now = new Date();
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current date is  : " + format1.format(now));

        SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Current date is  : " + format2.format(now));

        SimpleDateFormat format3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        System.out.println("Current date is  : " + format3.format(now));

        SimpleDateFormat format4 = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
        System.out.println("Current date and time is  : " + format4.format(now));

        SimpleDateFormat format5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        System.out.println("Current date and time is  :  " + format5.format(now));

        SimpleDateFormat format6 = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Current time is  :   " + format6.format(now));

        int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Current week of year is : " + weekOfYear);

        int weekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
        System.out.println("Current week of month : " + weekOfMonth);

        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println("Current day of the year is : " + dayOfYear);
    }
}
