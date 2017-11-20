import java.io.*;
public class Day$
{
    public static void arnab (int k ,  int m , int year) 
    {
        int c,y,w,M = 0 ;
        String day = null;
        if (m>2 && m<=12)
        M = m-2;
        else if (m>0 && m<=2)
        {
            M = m + 10 ;
            year -= 1;
        }
        c = year/100;
        y = year%100;
        w = (int)((Math.floor(2.6*M - 0.2) - 2*c + y + (Math.floor(y/4)) + (Math.floor(c/4)))%7);
        System.out.println(" W = " + w);
        if (w<0)
        w += 7;
        if (w==0)
        day = " Sunday ";
        if (w==1)
        day = " Monday ";
        if (w==2)
        day = " Tuesday ";
        if (w==3)
        day = " Wednesday ";
        if (w==4)
        day = " Thursday ";
        if (w==5)
        day = " Friday ";
        if (w==6)
        day = " Saturday ";
        System.out.println("\n\tThe day is " + day);
    }
}
