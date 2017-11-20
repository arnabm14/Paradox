import java.io.*;
import java.util.Scanner;
public class MyArrayManager
{
    public static void main(String[] args)
    {
        int choice,n;
        int[ ] array = {0,0,0,0,0,0,0,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        do {
                System.out.println("\n\tPerform the following methods:");
                System.out.println("\t1: Initialize");
                System.out.println("\t2: Insert");
                System.out.println("\t3: Remove");
                System.out.println("\t4: Display");
                System.out.println("\t5: Quit");
                System.out.print("\tEnter your choice : ");
                choice = sc.nextInt();
                switch (choice)
                {
                    case 1: initialize(array);
                            break;
                    case 2: System.out.print("\n Enter the Number to Add : ");
                            n = sc.nextInt();
                            insert(array,n);
                            break;
                    case 3: System.out.print("\n Enter the Number to delete : ");
                            n = sc.nextInt();
                            remove(array,n);
                            break;
                    case 4: display(array);
                            break;
                    case 5: System.out.println("\n\tProgram terminating ….");
                            break;
                    default: System.out.println("\n\tPlease enter a Correct option");
                    break;
                }
            } while (choice != 5);
    }
    public static void initialize(int[] ar)
    {
        Scanner sc = new Scanner(System.in);
        int i,j,n,temp;
        int arr[]= new int[11];
        arr[0]=0;
        System.out.print("\n Enter the number of intergers to input : ");
        n = sc.nextInt();
        while(n>10)
        {
            System.out.print("\n\t Enter a Lower value, Array full :");
            n = sc.nextInt();
        }
        System.out.print("\n Enter the Values to input : ");
        for(i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
            arr[0]++;
        }
        for(i=1;i<=n;i++)
        {   
            for(j=i;j<n;j++)
            {    if((arr[j+1]-arr[j])<0)
                 {  temp=arr[j+1];
                     arr[j+1]=arr[j];
                     arr[j]=temp;
                 }  
                }
        }
        for(i=1;i<=n;i++)
        {
            insert(ar,arr[i]);
        }
    }
    public static void insert(int[] ar, int n)
    {
        int i,j,k,temp;
        if(ar[0]==10)
        {
            System.out.println("\n\tError: Its full\n");
        }
        else
        {
            i=1;
            while(ar[i]!=0)
            {
                i++;
            }
            ar[i]=n;
            ar[0]++;
            for(k=1;k<=i;k++)
            {   
            for(j=k;j<i;j++)
            {    if((ar[j+1]-ar[j])<0)
                 {  temp=ar[j+1];
                     ar[j+1]=ar[j];
                     ar[j]=temp;
                 }  
                }
            }
        }
    }
    public static void remove(int[] ar, int n)
    {
        if(ar[0]==0)
        {
            System.out.println("\n\tError: Its Empty\n");
        }
        else
        {
             int i,flag=1;
             for(i=1;i<11;i++)
             {
                 if(ar[i]==n)
                 {
                     flag=0;
                     break;
                 }
             }
             if(flag==1)
             {
                 System.out.println("\n\tError: Not Found\n");
             }
             else
             {
                 i--;
                 System.out.println("\n\tDeleted "+n+" from the List\n");
                 ar[0]--;
                 while(ar[i++]!=0 && i<10)
                 {
                     ar[i]=ar[i+1];
                 }
             }
        }
    }
    public static void display(int[] ar)
    {
        int i=1;
        while(ar[i]!=0 && i<10)
        {
            System.out.println(" No."+i+" = "+ar[i]);
            i++;
        }
    }
}
