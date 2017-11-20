import java.io.*;
import javax.swing.*;
public class Date_to_Day
{
    public static void main () throws IOException
    {
        int d = 0 , m = 0 , year = 0, c , y = 0 , w ,M = 0 ;
        String day = null ;
        BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
        try    
        {    System.out.print("\t Please Enter the Date : ");
            d = Integer.parseInt(z.readLine());
            System.out.print("\t Please Enter the Month : ");
            m = Integer.parseInt(z.readLine());
            System.out.print("\t Please Enter the Year : ");
            year = Integer.parseInt(z.readLine());
        if (m>0 && m<=12 && d>0 && d<=31)
        {
            y = year ;
            if(m>2 && m<=12)
            M = m - 2;
            else if (m>0 && m<=2)
            {
                M = m + 10 ;
                y -= 1;
            }
            c = y/100;
            y = y%100;
            w = (int)((d + (Math.floor(2.6*M - 0.2) - 2*c + y + (Math.floor(y/4)) + Math.floor(c/4)))%7);
            if (w<0 )
            w += 7;
            if (w == 0)
            day = "Sunday";
            if (w == 1)
            day = "Monday";
            if (w == 2)
            day = "Tuesday";
            if (w == 3)
            day = "Wednesday";
            if (w == 4)
            day = "Thursday";
            if (w == 5)
            day = "Friday";
            if (w == 6)
            day = "Saturday";
            //exit();
            JOptionPane.showMessageDialog(null," \n\t The  Given date  " + d+"/"+m+"/"+year + " is  a  :  " + day);
           // System.out.println(" \n\t The  Given date  " + d+"/"+m+"/"+year + " is  a  :  " + day);
        }
        else 
        {
            if ((d<1 || d>31) && (m<1 || m>12))
            day = " Date And Month ";
            else if (d<1 || d>31)
            day = " Date ";
            else
            day = " Month ";
            System.out.println("\n\tThe input  of the " + day + " is Wrong ");
        }
      }
      catch (Exception e)
      {
            System.out.println("\tAn Exception has occured during Input  , " + e.getMessage());
      }
    }
}
