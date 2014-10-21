/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package old.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author sendres1
 */
public class Startup {
    public static void main(String[] args) throws ParseException {
        
        // this is the old api
        // get from date/calendar object to strings
        Demo1 demo1 = new Demo1();
        Date date = demo1.getCurrentDateTime();
        System.out.println(date);
        Date date2 = demo1.getSpecificDateTime();
        System.out.println(date2);
        Calendar calendar = demo1.getCurrentCalendar();
        // time is saved as gmt.
        //                                                            a = am/pm  m = miliary
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yy hh:mm:ss a");
        SimpleDateFormat sdf2 = new SimpleDateFormat("M/d/yy hh:mm:ss z");
       
        // converting string
        System.out.println(sdf.format(date));
        
       
        System.out.println(sdf2.format(calendar.getTime()));
       
        // how to get from a string to calendar/date objects
        //how to get into a date object
        //format must match exactly.
        String s = "10/20/14 06:18:59 PM";
        Date date3 = sdf.parse(s);
        System.out.println("parsed date: " + date2);
        
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        System.out.println("parsed Calendar: " + cal2);
        
        //count days or time
        Calendar startDate = Calendar.getInstance();
        startDate.set(2014, Calendar.JANUARY, 1);
       
        // roll the date backwards 2 years
        startDate.roll(Calendar.YEAR, -2);
        
        Calendar endDate = Calendar.getInstance();
        endDate.set(2014, Calendar.JANUARY, 15);
        long startMsec = startDate.getTimeInMillis();
        long endMsec = endDate.getTimeInMillis();
        long diff = endMsec - startMsec;
        //             milleseconds/seconds/minutes/hours/days
        long days = diff/1000/60/60/24;
        System.out.println("Days between days :" + days);
        
        
                
                
                
        
      
    }
 
    
}
