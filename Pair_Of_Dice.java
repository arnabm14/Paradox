import java.io.*;
public class Pair_Of_Dice
{
    int die1 , die2 ; 
    public Pair_Of_Dice()
    {
        die1 = (int)(Math.random()*6) + 1;      // As Math.random gives values between 0 and 1 ,
        die2 = (int)(Math.random()*6) + 1;      // and the least value will be 1 and not 0 .
    }
    public static void main () throws IOException
    {
        int total1 , total2 ;
        String n1 , n2 ;
        Pair_Of_Dice firstdice = new Pair_Of_Dice();
        Pair_Of_Dice seconddice = new Pair_Of_Dice();
        BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
        try 
        {
            total1 = firstdice.die1 + firstdice.die2;
            total2 = seconddice.die1 + seconddice.die2;
            System.out.print(" \n\t Enter the 1st Player's name : " );
            n1 = z.readLine();
            System.out.print(" \t Enter the 2nd Player's name : " );
            n2 = z.readLine();
            //System.out.println(" \n\n\t The 1st Pair comes as  6 and 6 with total = 12 ");
            System.out.println(" \n\n\t The 1st Pair comes as " + firstdice.die1 + " and " + firstdice.die2 + " with total = " + total1);
            //System.out.println(" \n\n\t The 1st Pair comes as  1 and 1 with total = 2 ");
            System.out.println(" \t The 2nd Pair comes as " + seconddice.die1 + " and " + seconddice.die2 + " with total = " + total2);
            if ( total1 > total2)
            System.out.println(" \n\t " + n1 + " wins ");
            else if ( total1 < total2)
            System.out.println(" \n\t " + n2 + " wins ");
            else
            System.out.println(" \n\t Its a draw");
        }
        catch (Exception e)
        {
            System.out.println("\tAn Exception has occured during Input " + e.getMessage() );
        }
    }
}
