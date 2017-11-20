import java.io.*;
public class Initials_of_Name
{
    public static void main (String args[]) throws IOException
    {
        System.out.print("\tSorry I didn't catch your name ::\n\tCan you please say again :: \n\n\t\t");
        int i ,sp = 0,last = 0 ;
        int c;
        String s,s1;
        BufferedReader z = new BufferedReader(new InputStreamReader (System.in));
        s = z.readLine();
        for (i=0 ; i<s.length() ; i++)
        {
            if (s.charAt(i) == ' ')
            {
                sp = sp + 1;
                last = i;
            }
        }
        s1 = " " + s;
        System.out.print("\n\n\t\tMr  ");
        for (i = 0 ; i<s1.length() ; i++)
        {
            if (s1.charAt(i) == ' ');
            {
               if ( sp-- == 0)
               break;
               else
                {
                    c = (int)(s1.charAt(i+1));
                    if ( c>=97 && c<=122)
                    c = c - 32;
                    System.out.print((char)c + ".");
                }
                
            }
        }
        
        System.out.print(s.substring(last+1));
        System.out.println(" , Have a nice day " );
    }
}

            