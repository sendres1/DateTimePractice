/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package old.api;

import java.util.Date;

/**
 *
 * @author sendres1
 */
public class Order {
    private Date orderDate;


public String getFormattedDate(String format){
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    return sdf.format(orderDate);
}

public void setOrderDateFromString(String dateVale, 
     String format)throws ParseException  {
      SimpleDateFormat sdf = new SimpleDateFormat(format);
         orderDate = sdf.parse(dateValue);
}

public Date getOrderDate(){
      return orderDate;
}

public Date setOrderDate(Date orderDate){
    this.orderDate = orderDate;
}


}