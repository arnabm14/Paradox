public class Infinte_Prime_Number
{

    public static void main()
    {
       long i=0,p=0,j,z=0;
        for (;;i++)
       { 
           z=0;
           for(j=2;j<Math.sqrt(i);j++)
           {
               if (i%j==0)
              { z=1;break;}
            }
             if (z==0)
             {System.out.print(i+" ");
              p++;
             if (p%23==0)
             System.out.println();
            }
            
        }
    }
}
