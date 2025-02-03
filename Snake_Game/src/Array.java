//1. Accept size and values from user in aray
import java.util.*;

public class Array 
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n;
        
        System.out.print("Enter Size of array: ");
        n= scan.nextInt();
        
        //declare array 
        int a[]=new int[n];
        
        //Accept values from user
        System.out.print("Accept values from user: \n");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        
        //Display Array
        System.out.print("Display values of array: \n");
        for(int i=0;i<n;i++)
        {
          
            System.out.print(a[i]);
            System.out.println();

        }
        
        
        
        
        
    }
}
