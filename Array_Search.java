import java.io.*;
public class Array_Search 
{
    public static void main () throws IOException
    {
        int i , j , n , tmp , flag = 0 , p = 0 , L = 0 , U = 4  ;
        int A[] = new int[5];
        BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("\t Please Enter the Five values for an array ::\n ");            
            for ( i = 0 ; i<5 ; i++)
            {
                System.out.print(" \t ");
                A[i] = Integer.parseInt(z.readLine()); 
            }
            for ( i = 0 ; i<5 ; i++)                    // Bubble Sort Is done 
            {
                for(  j=0 ; j<4 ;j++)
                {
                    if (A[j] > A[j+1])
                    {
                        tmp = A[j];
                        A[j] = A[j+1];
                        A[j+1] = tmp;
                    }
                }
            }
            System.out.print("\n\t The Array in Ascending order is ::  " );
            for ( i = 0 ; i<5 ; i++)
            {
                System.out.print(A[i]);
                if (i != 4)
                System.out.print(" , ") ;
            }
            System.out.print("\n\t Please Enter the value you want to search =  ");
            n = Integer.parseInt(z.readLine());   
            while( L <= U)                              // Binary Search
            {
                i = (L+U) / 2 ;
                if ( n > A[i])
                {
                    L = i + 1;
                }
                else if ( n < A[i])
                {
                    U = i - 1;
                }
                else 
                {
                    p = i + 1 ;
                    flag = 1 ;
                    break;
                }
            }
            if ( flag == 1 )
            System.out.println("\n\t Search Successfull , Found at  position number " + p);
            else
            System.out.println("\n\t The Search Value is not present in the given Array ");
        }
        catch ( Exception e )
        {
            System.out.println(" \n\t An Exception  has occured during Input  , "  + e.getMessage());
        }
   }
}
    
            