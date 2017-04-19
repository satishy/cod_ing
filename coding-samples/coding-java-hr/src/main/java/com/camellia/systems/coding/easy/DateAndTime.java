package com.camellia.systems.coding.easy;

import java.util.Calendar;
import java.util.Scanner;

/**
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of
 * calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

 You are given a date. Your task is to find what the day is on that date.

 Input Format

 A single line of input containing the space separated month, day and year, respectively, in   format.

 Constraints

 Output Format

 Output the correct day in capital letters.

 Sample Input

 08 05 2015
 Sample Output

 WEDNESDAY
 Explanation

 The day on August th  was WEDNESDAY.
 */
public class DateAndTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        int imonth = Integer.parseInt(month);
        int iday = Integer.parseInt(day);
        int iyear = Integer.parseInt(year);

        Calendar calendar = Calendar.getInstance();
        calendar.clear();

        String[] strDays = new String[] { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY",                 "SATURDAY"};
        calendar.set(Calendar.YEAR,iyear);
        calendar.set(Calendar.MONTH,imonth-1);
        calendar.set(Calendar.DATE,iday);
        // calendar.set(iyear,imonth,iday);
        //  System.out.println(calendar.getTime());

        System.out.println(strDays[calendar.get(Calendar.DAY_OF_WEEK)-1]);

    }


}
