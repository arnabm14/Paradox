import java.io.*;
class Jumble_Solver
{

    public static void main(String args[])throws IOException
    {
        BufferedReader z =  new BufferedReader ( new InputStreamReader (System.in));
        System.out.print(" \t Enter the Jmbled word :: ");
        String N = z.readLine();
        int i , j,o,k,l,p=0;
        char c[] = new char[5];
        c[0] = N.charAt(0);
        c[1] = N.charAt(1);
        c[2] = N.charAt(2);
        c[3] = N.charAt(3);
        c[4] = N.charAt(4);
        for(i=0;i<5;i++)
        {
          a:for(j=0;j<5;j++)
            {
              b:for(k=0;k<5;k++)
                {
                  c:for(l=0;l<5;l++)
                    {
                   d:for(o=0;o<5;o++)
                     {
                        
                        if(c[i]==c[j])
                        continue a;
                        if(c[j]==c[k])
                        continue b;
                        if(c[k]==c[l])
                        continue c;
                        if(c[l]==c[o])
                        continue d;
                        if(c[i]==c[k])
                        continue b;
                        if(c[i]==c[l])
                        continue c;
                        if(c[i]==c[o])
                        continue d;
                        if(c[j]==c[l])
                        continue c;
                        if(c[j]==c[o])
                        continue d;
                        if(c[k]==c[o])
                        continue d;
                        if(p%10==0)
                        System.out.println();
                        System.out.print(c[l] +""+ c[k] +""+c[o]+ c[j] +""+ c[i]+ " ");
                        p++;
                   }
                 }
              }
          }
        }
       
    }
}
