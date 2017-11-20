
/**
 * Write a description of class Sum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sum
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Sum
     */
    public Sum()
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
        int j,b,s,c = 0 , l=1;
        for(int i=4000;i<5000;i++)
        {
            j=i;
            s=0;
            while(j>0)
            {
                b = j%10;
                s = s + b;
                j = j/10;
            }
            if (s==18)
            {
                c++;
                if (l==30)
                {System.out.println( i + " ");l=0;}
                else
                System.out.print( i +" ");
                l++;
            }
        }
        System.out.println("c = " + c);
    }
}
