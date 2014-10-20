/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package old.api;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author sendres1
 */
public class Demo1 {
    public Date getCurrentDateTime(){
     
        Date currentDate = new Date();
        return currentDate; 
    }

    public Calendar getCurrentCalendar(){
         Calendar calendar = Calendar.getInstance();
  //      Date currentDate = new Date();
      return calendar; 
    }
    
    public Date getSpecificDateTime(){
        // calendar class is abstract, meaning that our cant instantiate
        // actually get lSP gregorain canlendar
       
        Date currentDate = new Date(2015 - 1900,0,1);
        return currentDate;
                
    }
}
