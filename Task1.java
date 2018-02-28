package lab1;


import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task1 {
        public static void main(String[] args) {

            String str = "2007-04-05T12:51:04 MSK";
            SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-DD'T'HH:MM:SS zzz");
            SimpleDateFormat dateFormat = new SimpleDateFormat();
            dateFormat.applyPattern("YYYY-MM-DD'T'HH:MM:SS zzz");
            System.out.println(str);


            Date d = null;
            try {
                d = dateFormat.parse(str);
                System.out.println("Date is " + date.format(d));
            } catch (ParseException ex) {
                System.out.println("Wrong date.");
            }

            Calendar myCalendar = new GregorianCalendar();
            myCalendar.setTime(d);
            System.out.println(date.format(myCalendar.getTime()));
            

            myCalendar.set(Calendar.DAY_OF_WEEK, myCalendar.getActualMinimum(Calendar.DAY_OF_WEEK));
            myCalendar.add(Calendar.DAY_OF_WEEK, -6);
            System.out.println("The beginning of the week: " + myCalendar.getTime());


            myCalendar.set(Calendar.DAY_OF_WEEK, myCalendar.getActualMaximum(Calendar.DAY_OF_WEEK));
            System.out.println("The end of the week: " + myCalendar.getTime());

            myCalendar.set(Calendar.HOUR_OF_DAY, 0);
            myCalendar.set(Calendar.MINUTE, 0);
            myCalendar.set(Calendar.SECOND, 0);
            myCalendar.add(Calendar.DAY_OF_YEAR, 1);
            System.out.println("The beginning of the next day: " + myCalendar.getTime());


            myCalendar.add(Calendar.MONTH, 1);
            myCalendar.set(Calendar.DAY_OF_MONTH, 1);
            myCalendar.get(Calendar.HOUR);
            System.out.println("The beginning of the next month: " +myCalendar.getTime());

        }
}

