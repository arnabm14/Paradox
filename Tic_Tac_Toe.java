import java.io.*;
class Tic_Tac_Toe
{
    static char a[] = new char[9],i;
    public Tic_Tac_Toe()
    {
        for(i=0;i<9;i++)
        {
            a[i]=' ';
        }    
    }
    public static int CheckWin()
    {
        if ((a[0]==a[1] && a[1]==a[2] && a[2]!=' ') || (a[3]==a[4] && a[4]==a[5] && a[5]!=' ') || (a[6]==a[7] && a[7]==a[8] && a[8]!=' ') || (a[0]==a[3] && a[3]==a[6] && a[6]!=' ') || (a[1]==a[4] && a[4]==a[7] && a[7]!=' ') || (a[2]==a[5] && a[5]==a[8] && a[8]!=' ') || (a[0]==a[4] && a[4]==a[8] && a[8]!=' ') || (a[2]==a[4] && a[4]==a[7] && a[7]!=' '))
            return 1;
        else 
            return 0;
    }
    public static int HumanMove(char x)throws IOException
    {
        int p;
        BufferedReader hm = new BufferedReader (new InputStreamReader(System.in));
        while(true)
        {
            System.out.print("\n\t Enter your Move Position Number : ");
            p = Integer.parseInt(hm.readLine());
            if (a[p-1]==' ')
            {
                break; 
            }
            else
            {
                System.out.println("\tPlease Enter a Valid Position on the Board . ");
                print(); 
            }
        }
        a[p-1]= x;
        System.out.println("-------------------------------------------------------");
        System.out.println("\n\tThe Human Move :");
        print();
        if(CheckWin()==1)
            return 1;
        else 
            return 0;
    }
    public static int ComputerMove(char x)
    {
        int i;
        char other_move;
        for (i=0;i<9;i++)
        {
            if (a[i]==' ')
            {
                a[i]= x ;
                if (CheckWin()==1)
                {
                    System.out.println("\tThe Computer Move :");
                    print();
                    return 1;
                }
                else {a[i]=' ';}
            }
        }
        if(x=='X')
            other_move='O';
        else 
            other_move='X';
        for (i=0;i<9;i++)
        {
            if (a[i]==' ')
            {
                a[i]= other_move;
                if (CheckWin()==1)
                {
                    a[i]= x ;
                    System.out.println("\tThe Computer Move :");
                    print();
                    return 0;
                }
                else {a[i]=' ';}
            }
        }
        if (a[0]==' ')
        {
            a[0]= x;
        }
        else if (a[2]==' ')
        {
            a[2]= x;
        }
        else if (a[6]==' ')
        {
            a[6]= x;
        }
        else if (a[8]==' ')
        {
            a[8]= x;
        }
        else if (a[4]==' ')
        {
            a[4]= x;
        }
        else if (a[1]==' ')
        {
            a[1]= x;
        }
        else if (a[3]==' ')
        {
            a[3]= x;
        }
        else if (a[5]==' ')
        {
            a[5]= x;
        }
        else 
        {
            a[7]= x;
        }
        System.out.println("The Computer Move :");
        print();
        return 0;
    }
    public static void print()
    {
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\t\t "+a[0] + " | "+a[1]+" | "+a[2]);
        System.out.println("\t\t\t ---------");
        System.out.println("\t\t\t "+a[3] + " | "+a[4]+" | "+a[5]);
        System.out.println("\t\t\t ---------");
        System.out.println("\t\t\t "+a[6] + " | "+a[7]+" | "+a[8]);
        System.out.println("-------------------------------------------------------");
    }
    public static void main() throws IOException
    {
        char human='O',comp='X';
        int h=0,c=0,i,counter;
        BufferedReader T = new BufferedReader (new InputStreamReader(System.in));
        Tic_Tac_Toe ttt = new Tic_Tac_Toe();
        System.out.println("\n\t\t*** Computer Vs Human ***");
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\t\t 1 | 2 | 3");
        System.out.println("\t\t\t ---------");
        System.out.println("\t\t\t 4 | 5 | 6");
        System.out.println("\t\t\t ---------");
        System.out.println("\t\t\t 7 | 8 | 9");
        System.out.println("-------------------------------------------------------");
        System.out.print("Would you like to take the first move ? (y/n) : "  );
        char ch = (char) T.read();
        if (ch=='y' || ch=='Y')
        {
            human='X';
            comp='O';
            ttt.HumanMove(human);
        }
        do
        {
            counter=1;
             c = ttt.ComputerMove(comp);
            if (c==1)
                  continue;
            else
            {
                 h=ttt.HumanMove(human);
                 if (h==1) 
                    continue;
            }
            for(i=0;i<9;i++)
            {
                 if(a[i]==' ')
                 {
                     counter=0;
                     break;
                 }
            }
            if(counter==1)
            {
                 h=1;
                 c=1;
            }
        }while(h==0 && c==0);
        if(h==1 && c==1)
            System.out.println("\n\t Its a Tie !\n\t Well Played !!!");
        else if (h==1)
            System.out.println("\n\t You Have Won!!!!");
        else 
            System.out.println("\n\t The Computer Has Won!!");
    }
}
