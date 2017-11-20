class The_Jumble_Solver
{
    public static void main (String ns , int ch)
    {
            char c[] =  new char[6];
            String ar[] = new String[720];
            int i,j,k,l,m,n,p=0,o,ii;
            switch (ch)
            {
                case 6:
                c[0] = ns.charAt(0);
                c[1] = ns.charAt(1);
                c[2] = ns.charAt(2);
                c[3] = ns.charAt(3);
                c[4] = ns.charAt(4);
                c[5] = ns.charAt(5);
   
                for ( i=0 ; i<6 ; i++ )
                {   
                    b: for ( j=0 ; j<6 ; j++ )
                            {
                                c: for ( k=0 ; k<6 ; k++ )
                                        {
                                            d: for ( l=0 ; l<6 ; l++ )
                                                        {
                                                            e: for ( m=0 ; m<6 ; m++ )
                                                                        {
                                                                            ff: for ( n=0 ; n<6 ; n++ )
                                                                                            {
                                                                                                if (i==j)
                                                                                                continue b;
                                                                                                if (i==k)
                                                                                                continue c;
                                                                                                if (i==l)
                                                                                                continue d;
                                                                                                if (i==m)
                                                                                                continue e;
                                                                                                if (i==n)
                                                                                                continue ff;
                                                                                                if (j==k)
                                                                                                continue c;
                                                                                                if (j==l)
                                                                                                continue d;
                                                                                                if (j==m)
                                                                                                continue e;
                                                                                                if (j==n)
                                                                                                continue ff;
                                                                                                if (k==l)
                                                                                                continue d;
                                                                                                if (k==m)
                                                                                                continue e;
                                                                                                if (k==n)
                                                                                                continue ff;
                                                                                                if (l==m)
                                                                                                continue e;
                                                                                                if (l==n)
                                                                                                continue ff;
                                                                                                if (m==n)
                                                                                                continue ff;
                                                                                                ar[p] =  c[i] +""+ c[j] +""+ c[k] +""+ c[l] +""+ c[m] +""+ c[n]  ;
                                                                                                for (ii=0 ; ii<p ; ii++)
                                                                                                {
                                                                                                    if (ar[ii].equals(ar[p]))
                                                                                                    continue ff;
                                                                                                }
                                                                                                if (p%24==0)
                                                                                                System.out.println("\n");
                                                                                                System.out.print(ar[p] + " ");
                                                                                                p++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
            }
            break;
                case 5 :
                c[0] = ns.charAt(0);
                c[1] = ns.charAt(1);
                c[2] = ns.charAt(2);
                c[3] = ns.charAt(3);
                c[4] = ns.charAt(4);
           
            
            
             for(i=0;i<5;i++)
             {
                 a:for(j=0;j<5;j++)
                 {
                     b:for(k=0;k<5;k++)
                     {
                         c:for(l=0;l<5;l++)
                         {
                             d:for(o=0;o<5;o++)
                             {
                        
                                 if(i==j)
                                 continue a;
                                 if(j==k)
                                 continue b;
                                 if(k==l)
                                 continue c;
                                 if(l==o)
                                 continue d;
                                 if(i==k)
                                 continue b;
                                 if(i==l)
                                 continue c;
                                 if(i==o)
                                 continue d;
                                 if(j==l)
                                 continue c;
                                 if(j==o)
                                 continue d;
                                 if(k==o)
                                 continue d;
                                 ar[p] =  c[i] +""+ c[j] +""+ c[k] +""+ c[l] +""+ c[o]  ;
                                 for (ii=0 ; ii<p ; ii++)
                                 {
                                           if (ar[ii].equals(ar[p]))
                                           {
                                               continue d;
                                            }
                                 }
                                 if(p%10==0)
                                 System.out.println("\n");
                                 System.out.print(ar[p] + " ");
                                 p++;
                                }
                            }
                        }
                    }
        }
        break;
        default : 
                    System.out.print("\n\t Wrong Input , Enter 1 or 2 only ...... ;-) .......... ");
                    break;
    }
        }
    }
    

/* 720 = 6*6*10;
2,3,2,3,2,5;

!@#$%^&*(

*/

