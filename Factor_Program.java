
/**
 * Write a description of class Factor_Program here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Factor_Program
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Factor_Program
     */
    public Factor_Program()
    {
        // initialise instance variables
        x = 0;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main()
    {
        int i ,n =0,j;
        for ( i =1980 ; i <=2020 ;i++)
        {
            n = 0;
            System.out.print("The Factors  of "+i+" are :: ");
            for (j = 2 ; j<=i ;j++)
            {
                if (i%j==0)
                {
                   System.out.print(j + " , ");
                }
            }
            System.out.println();
        }
    }
}
