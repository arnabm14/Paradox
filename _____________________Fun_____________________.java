import java.util.*;
/**
 * Write a description of class Fun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class _____________________Fun_____________________
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Fun
     */
    public _____________________Fun_____________________()
    {
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void date()
    {
        // put your code here
        Date d = new Date();
        System.out.println("\t The Date is  = " + d );
    }
    public static void calendar()
    {
       
       Calendar c =  Calendar.getInstance();
       System.out.println(" Today is " +(c.get(Calendar.DATE))  + "/" +  (c.get(Calendar.MONTH) + 1) + "/" + (c.get(Calendar.YEAR)));
    }
    public static void ASCII()
    {
        System.out.println(" /u0081 = " + '\u0081');
        System.out.println(" /u00B1 = " + '\u00B1');
        System.out.println(" /a");
    }
}
