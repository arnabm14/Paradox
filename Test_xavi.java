import java.io.*;
public class Test_xavi extends Xavi
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        Xavi x=new Xavi();
        System.out.println("ENTER YOUR CHOICE :");
        System.out.println("***********************************");
        System.out.println("1. Execute Nested Loop Programs  ");
        System.out.println("2. Execute Array Programs ");
        System.out.println("***********************************");
        
        
        
        try
        {
                    int t=Integer.parseInt(b.readLine());
                
                    while(t==1||t==2)
                    {
                    
                        if(t==1||t==2)
                        {
                            while(t==1||t==2)
                            {
                                while(t==1)
                                {
                                    x.nest();
                                    System.out.println("ENTER 1 TO CONTINUE WITH SAME OPTION OR 2 TO SWITCH OVER TO THE SECOND OPTION OR ANY OTHER NUMBER TO EXIT THE PROGRAM");
                                    t=Integer.parseInt(b.readLine());
                                }
                                while(t==2)
                                {
                                    x.array();
                                    System.out.println("ENTER 2 TO CONTINUE WITH SAME OPTION OR 1 TO SWITCH OVER TO THE PREVIOUS OPTION OR ANY OTHER NUMBER TO EXIT THE PROGRAM");
                                    t=Integer.parseInt(b.readLine());
                                }
                        
                            }
                            if(t!=1||t!=2)
                            {
                                System.out.println("WRONG INPUT");
                                System.out.println("ENTER 1 OR 2 TO CONTINUE THE PROGRAM ACCORDING TO THE CHOICE OR ENTER ANY OTHER NUMBER TO EXIT");
                                t=Integer.parseInt(b.readLine());
                            }
                        }
                    }
                
        }
        catch(IOException e)
        {
            System.out.println("EXCEPTION: Input Output Error");
        }
        catch(NumberFormatException e)
        {
            System.out.println("EXCEPTION: Wrong Input Type");
        }
        catch(NullPointerException e)
        {
            System.out.println("EXCEPTION: Blank Input");
        }
        finally
        {
            

        System.out.println("Thank you for accessing the program");
        
        x.comment();
        System.out.flush();
        System.out.flush();
        System.out.flush();
        System.out.flush();
        
    }   
    }
}


    

        
        
        
        
	