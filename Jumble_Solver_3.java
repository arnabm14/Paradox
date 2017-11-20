
/**
 * Write a description of class Jumble_Solver_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jumble_Solver_3
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class Jumble_Solver
     */
    public Jumble_Solver_3()
    {
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String args)
    {
        // put your code here
        int i , j,o,k,l,m,p=0;
        char c[] = new char[6];
        for(i=0;i<6;i++)
        {
            c[i] = args.charAt(i);
        }

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
                         e:for(m=0;m<5;m++)
                     {
                        
                        if(c[i]==c[j])
                        continue e;
                        if(c[j]==c[k])
                        continue e;
                        if(c[k]==c[l])
                        continue e;
                        if(c[l]==c[o])
                        continue e;
                        if(c[i]==c[k])
                        continue e;
                        if(c[i]==c[l])
                        continue e;
                        if(c[i]==c[o])
                        continue e;
                        if(c[j]==c[l])
                        continue e;
                        if(c[j]==c[o])
                        continue e;
                        if(c[k]==c[o])
                        continue e;
                        if(c[i]==c[m])
                        continue e;
                        if(c[j]==c[m])
                        continue e;
                        if(c[k]==c[m])
                        continue e;
                        if(c[l]==c[m])
                        continue e;
                        if(c[o]==c[m])
                        continue e;
                        if(p%10==0)
                        System.out.println();
                        System.out.print(c[l] +""+ c[k] +""+c[o]+ c[j] +""+ c[i] +c[p]+" ");
                        p++;
                   }
                 }
              }
          }
        }
    }
             /* for(i=0;i<5;i++)
        {
          a:for(j=0;j<5;j++)
            {
              b:for(k=0;k<5;k++)
                {
                  c:for(l=0;l<5;l++)
                    {
                        if(c[i]==c[j])
                        continue a;
                        if(c[j]==c[k])
                        continue b;
                        if(c[k]==c[l])
                        continue c;
                        if(c[i]==c[k])
                        continue b;
                        if(c[i]==c[l])
                        continue c;
                        if(c[j]==c[l])
                        continue a;
                        if(p%10==0)
                        System.out.println();
                        System.out.print(c[i] +""+ c[j] +""+ c[k] +""+ c[l]+ " ");
                        p++;
                    }
                }
            }
         }*/
    }
}
