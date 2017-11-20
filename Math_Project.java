public class Math_Project
{
    public static void main ()
    {
        // put your code here
        int i ,j , k ,p,ab, max = 0, n = 0;
        int a[] = {54,66,42,46,63,66,61,86,70,69,58,73,59,56,67,49,52,83,87,81,74,60,69,75,81,59,48,51,43,86,83,60,59,55,82,90,84,80,51,43,39,87,91,63,70,74,73,79,78,65,47,52,95,91,56,64,89,76,75,86};
        for (i=0;i<60;i++)
        {
            ab=0;
            for (p=1;p<i;p++)
            {
                if (a[i]==a[p])
                ab=0;
            }
            k=1;
            if (ab!=0)
            {
                
                for (j=i;j<60;j++)
                {
                    if( a[j] == a[i] )
                    k++;
                }
                if(k>0)
                {
                    System.out.println("k= "+ k +" i= "+ i);
                    if (k>max)
                    {
                        max = k;
                        n = i;
                    }
                }
            }
        }
        System.out.println("\tThe answer is = " + n + " coming "+ max + " times ");
    }
}