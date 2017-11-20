
import java.awt.*;
import java.applet.*;
import javax.swing.*;

/**
 * Class MOVING_CIRCLE - To print a moving circle
 * 
 * Arnab mondal 
 * Version 2.0
 */
public class Moving_Circle extends JApplet
{
    // instance variables - replace the example below with your own
    

     /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init()
    {
        // this is a workaround for a security conflict with some browsers
        // including some versions of Netscape & Internet Explorer which do 
        // not allow access to the AWT system event queue which JApplets do 
        // on startup to check access. May not be necessary with your browser. 
        JRootPane rootPane = this.getRootPane();    
        rootPane.putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
    
        // provide any initialisation necessary for your JApplet
    }

    /**
     * Called by the browser or applet viewer to inform this JApplet that it 
     * should start its execution. It is called after the init method and 
     * each time the JApplet is revisited in a Web page. 
     */
    public void start()
    {
        // provide any code requred to run each time 
        // web page is visited
    }

    /** 
     * Called by the browser or applet viewer to inform this JApplet that
     * it should stop its execution. It is called when the Web page that
     * contains this JApplet has been replaced by another page, and also
     * just before the JApplet is to be destroyed. 
     */
    public void stop()
    {
        // provide any code that needs to be run when page
        // is replaced by another page or before JApplet is destroyed 
    }

    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint (Graphics g)
    {
        int i,j,m=1;
        String a[][] = new String[13][13];
        String b[][] = new String[13][13];
        Moving_Circle z = new Moving_Circle ();
        z.start();
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
        g.drawRect(10,10,40,40);
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
        g.drawRect(60,60,120,120);
        for (int k=1 ;k<=5 ;k++ )
        {
            
            if ((m++)%2==1)
            {
                        g.clearRect(0,0,100,100);
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
                       g.clearRect(0,0,100,100);
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
        
        g.drawRect(130,130,140,140);
        g.draw3DRect(140,160,300,300,false);
    }
    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * is being reclaimed and that it should destroy any resources that it
     * has allocated. The stop method will always be called before destroy. 
     */
    public void destroy()
    {
        // provide code to be run when JApplet is about to be destroyed.
    }


    /**
     * Returns information about this applet. 
     * An applet should override this method to return a String containing 
     * information about the author, version, and copyright of the JApplet.
     *
     * @return a String representation of information about this JApplet
     */
    public String getAppletInfo()
    {
        // provide information about the applet
        return "Title:   \nAuthor:   \nA simple applet example description. ";
    }


    /**
     * Returns parameter information about this JApplet. 
     * Returns information about the parameters than are understood by this JApplet.
     * An applet should override this method to return an array of Strings 
     * describing these parameters. 
     * Each element of the array should be a set of three Strings containing 
     * the name, the type, and a description.
     *
     * @return a String[] representation of parameter information about this JApplet
     */
    public String[][] getParameterInfo()
    {
        
        // provide parameter information about the applet
        String paramInfo[][] = {
                 {"firstParameter",    "1-10",    "description of first parameter"},
                 {"status", "boolean", "description of second parameter"},
                 {"images",   "url",     "description of third parameter"}
        };
        return paramInfo;
    }
}
