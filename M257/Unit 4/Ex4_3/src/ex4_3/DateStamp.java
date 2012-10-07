package ex4_3;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Title: Exercise 4.3
 * Description: DateStamp contains a single static method
 * to return a string representing today's date in full, e.g.
 * Saturday, January 10, 2004
 *
 * Copyright:   Copyright (c) 2004, 2005
 * Company:     The Open University
 * @author      M257 Course Team
 * @version 1.1 27/05/2005
 */


public class DateStamp
{
   public static String getFullDate()
   {
      GregorianCalendar calendar = new GregorianCalendar();

      Date todaysDate = calendar.getTime();

      DateFormat fmt = 
         DateFormat.getDateInstance(DateFormat.FULL, Locale.ENGLISH);

      return fmt.format(todaysDate);
   }
}
