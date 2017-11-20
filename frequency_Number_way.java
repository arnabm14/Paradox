import java.io.IOException;
class frequency_Number_way 
{
    public static void main ( )throws IOException
    {
        I z = new I();
        long n,co ,max = 0;
        n = z.lon();
        String s = "" + n;
        int l = s.length();
        char ch ;
        System.out.println("\n\n\n");
        int  i,j,c ;
        for ( i=0 ; i<=10 ; i++ )
        {
            co = 0L ;
            for ( j=0;j<l ; j++)
            {
                ch = s.charAt(j);
                c = (int)ch-48;
                if (c==i)
                {
                    co++;
                }
            }
            if (co!=0)
            System.out.println(" The number  " + i +  " appears " + co );
            if (max<co)
            {
                max = i;
            }
        }
        co = 0L;
        for (i=0 ; i<l ;i++)
        {
            c = ((int)s.charAt(i))-48;
            if (max == c);
            {
                co++;
            }
        }
        System.out.println(" \n\n The maximum times occuring is  " + max + " , Occuring " + (co-3) + " times ");
        z.f();
    
    }
}

        
