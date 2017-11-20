import java.io.*;
    class I
    {
        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader z = new BufferedReader(a);
       int  inte ( ) throws IOException
        {
            System.out.print(" Enter a integer number::         ");
            int a = Integer.parseInt(z.readLine()); 
            return (a);
        }
       double doub ( ) throws IOException
        {
            System.out.print(" Enter a double number ::         ");
            double a = Double.parseDouble(z.readLine()); 
            return (a);
        }
       float floa ( ) throws IOException
        {
            System.out.print(" Enter a float number ::         ");
            float a = Float.parseFloat(z.readLine()); 
            return (a);
        }   
       long lon ( ) throws IOException
        {
            System.out.print(" Enter a long number ::         ");
            long a = Long.parseLong(z.readLine()); 
            return (a);
        }
       short shor ( ) throws IOException
        {
            System.out.print(" Enter a short number ::         ");
            short a = Short.parseShort(z.readLine()); 
            return (a);
        }
       byte byt ( ) throws IOException
        {
            System.out.print(" Enter a byte ::         ");
            byte a = Byte.parseByte(z.readLine()); 
            return (a);
        }
       boolean bool ( ) throws IOException
        {
            System.out.print(" Enter a boolean value ::         ");
            boolean a = Boolean.parseBoolean(z.readLine()); 
            return (a);
        }
       char cha ( ) throws IOException
        {
            System.out.print(" Enter a Character ::         ");
            char a = (char)z.read(); 
            return (a);
        }
       String stri ( ) throws IOException
        {
            System.out.print(" Enter a String ::         ");
            String a = z.readLine(); 
            return (a);
        }
       void f()
        {
        System.out.flush();
        System.out.flush();
        System.out.flush();
        System.out.flush();
        }
           
    }
    
           
            