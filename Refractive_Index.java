class Refractive_Index
{
    public static void main ( ) 
    {
        double i ,s=38.0000001,nu=0 ,d = 30,ri;
        int p = 0;
        for (i = .0000001 ; i<1; i= i + .0000001)
        {
            s = s+i;
            nu = (nu + s)/2.0;
            ri = (Math.sin(nu))/Math.sin(30);
            if (ri ==1.51)
            {
            System.out.println(" :::::::: " + ri );
            p++;
            }
            if (p==1)
            break;
         }
         if (p!=1)
         {  
            System.out.println("not found");
            System.out.flush();
       
     }
      System.out.flush();
        System.out.flush();
        System.out.flush();
}
 }
 