import java.awt.*;
import javax.swing.*;
public class Circle 
{
    public  static void main(Graphics g)
    {
      //  Graphics g = Graphics.getinstance();
        int i,j,m=1;
        String a[][] = new String[13][13];
        String b[][] = new String[13][13];
        for(i=0 ; i<13 ; i++)
        {
                     for(j=0 ; j<13 ; j++)
                     {
                         if (i%2==0)
                         {
                                if (i+j==6 || i+j==18)
                                a[i][j] ="*";
                                else if( (i==8 && j==2) || (i==2 && j==8))
                                a[i][j] ="*";
                                else if( (i==4 && j==10) || (i==10 && j==4))
                                a[i][j] ="*";
                                else
                                {
                                    a[i][j] =" ";
                                    
                                }
                         }
                         else
                         a[i][j] = " ";
                     }
        }
        for(i=0 ; i<13 ; i++)
        {
                     for(j=0; j<13 ; j++)
                     {
                         if (i%2==1)
                         {
                                if (i+j==6 || i+j==18)
                                b[i][j] ="*";
                                else if( (i==1 && j==7) || (i==7 && j==1))
                                b[i][j] ="*";
                                else if( (i==3 && j==9) || (i==9 && j==3))
                                b[i][j] ="*";
                                else if( (i==5 && j==11) || (i==11 && j==5))
                                b[i][j] ="*";
                                else
                                {
                                    b[i][j] =" ";
                                   
                                }
                         }
                         else
                         b[i][j] = " ";
                     }
        }
        for (int k=1 ;k<=2 ;k++ )
        {
            g.clearRect(0,0,1000,1000);
            if ((m++)%2==1)
            {
                        for(i=0 ; i<13 ; i++)
                        {
                            for(j=0 ; j<13 ; j++)
                            {
                                g.drawString(a[i][j],0,0);
                            }
                            System.out.println(" ");
                        }
            }
            else
            {
                       for(i=0 ; i<13 ; i++)
                       {
                           for(j=0 ; j<13 ; j++)
                           {
                               g.drawString(b[i][j],0,0);
                            }
                            System.out.println(" ");
                        } 
            }
            
        }
    }

}
