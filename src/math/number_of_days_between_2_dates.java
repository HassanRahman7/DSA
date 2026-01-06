package math;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class number_of_days_between_2_dates
{
    public static int daysBetweenDates(String data1, String data2)
    {
        int year1=Integer.parseInt(data1.substring(0,4));
        int month1=Integer.parseInt(data1.substring(5,7));
        int day1=Integer.parseInt(data1.substring(8));
        LocalDate date1 = LocalDate.of(year1, month1, day1);
        int year2=Integer.parseInt(data2.substring(0,4));
        int month2=Integer.parseInt(data2.substring(5,7));
        int day2=Integer.parseInt(data2.substring(8));
        LocalDate date2=LocalDate.of(year2,month2,day2);
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        return (int)Math.abs(daysBetween);
    }
    public static void main(String[] args)
    {
        System.out.println(daysBetweenDates("2019-06-29","2019-06-30"));
    }
}
