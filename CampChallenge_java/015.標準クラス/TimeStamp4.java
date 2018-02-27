/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeStamp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author shuhei01
 */

public class TimeStamp4 {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date T1 = sdf.parse("2015-01-01 00:00:00");
        Date T2 = sdf.parse("2015-12-31 23:59:59");
        
        long total = (T2.getTime() - T1.getTime());
      
        System.out.print(T2.getTime() - T1.getTime());
    }
    
}
