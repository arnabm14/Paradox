class String_Pattern
{
    public static void main ( )
    {
        int i , j;
        for ( i = 97 ;i<=122;i++)
        {
         
            for(j =i ;j<=122;j++)
            {
                if ( i==j)
                System.out.print( (char)(i-32));
                else
                System.out.print( (char)i);
                
            }
            System.out.println( " ");
            System.out.flush();
        System.out.flush();
        System.out.flush();
        System.out.flush();
        }
    }
}

        
        