import java.io.*;
class frequency_String_way 
{
    public static void main ( )throws IOException
    {
        BufferedReader z = new BufferedReader (new InputStreamReader (System.in ));
        System.out.println("Enter a String :: ");
        String s = z.readLine();
        int l = s.length();
        String m = "0";
        String c1;
        int c,i,j,k,am;
        System.out.println(" The given number is ::" + s +"\n\n");
        for (i =0;i<10;i++)
        {
            c = 0;
            for ( j = 0 ; j<l;j++)
            {
                 k = s.charAt(j) -48;    //to get the true value from the ASCII value
                 if (k==i)
                 c++;                   //count the number of times the word is repeated
            }
            if (c!=0)
            System.out.println(" The number " + i +" appears " + c + " times ");
            c1 = "c";
            if ( m.compareTo(c1) < 0 )
            m = "i";                       // to store the maximum times occuring digit
            if ( m.equals(c1))
             m = m+ "i" + " ";            // to store the all repeating numbers  
        }
        c = 0;
        am = m.charAt(0);
        for ( i = 0;i<l;i++)
        {
            
            if ( am== ((int)s.charAt(i))-48)         //explicit type casting
            c++;
            
        }
        System.out.println(" \n\nThe maximum times occuring number is "+ m + " , Occuring "+c+" times");
        System.out.flush();
        
    }
}

            
            