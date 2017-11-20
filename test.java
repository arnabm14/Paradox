import java.io.*;
class test
{
    public static void main ()throws IOException
    {
    
        int i ,t,sp = 0,last = 0 ;
        int c;
        String s,s1;
        BufferedReader z = new BufferedReader(new InputStreamReader (System.in));
        t= Integer.parseInt(z.readLine());
        while(t>0){
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
                    System.out.print((char)c + ". ");
                }
                
            }
        }
        System.out.print(s.substring(last+1));
        t--;
        }
        }
}

            