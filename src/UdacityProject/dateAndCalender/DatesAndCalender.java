package UdacityProject.dateAndCalender;

import java.util.Calendar;
import java.util.Date;

public class DatesAndCalender {
    public static void main(String[] args) {
        DatesAndCalender.displayCurrentDate();
        DatesAndCalender.displaySetDate();
    }
        private static void displayCurrentDate() {
            Calendar cal = Calendar.getInstance();
            System.out.println(cal);
            Date date = new java.util.Date();
            cal.setTime(date);
            System.out.println(cal.getTime());
        }

        private static void displaySetDate(){
            Calendar cal = Calendar.getInstance();
            cal.set(2031, 02, 02);
            Date date = cal.getTime();
            System.out.println(date);

        }

    }
