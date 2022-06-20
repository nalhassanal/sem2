package week12.lab.pastyear;
/*
Create a program to display the day, month, year and the name
of the day for today date.
Write a recursive method to display the name of the day of the
past date.
(Tip: use the today date as parameters for the recursive method).
 */

//Example output:
/*
Today Date (dd/mm/yyyy): 13/4/2016
Today is on Wednesday
Search Date (dd/mm/yyyy): 20/8/2015
Search Date is on Thursday
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class set2Q3 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2016,Calendar.APRIL,13);
        Date time1 = calendar.getTime();
        SimpleDateFormat day = new SimpleDateFormat("EEEE");
        System.out.println(day.format(time1));
        System.out.println(calendar.getWeeksInWeekYear());



        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
    }
}
