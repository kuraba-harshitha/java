/*
Write a program to find the single-digit even number in an array. 

Sample Input: 

Enter the size of an array:

3

Enter the array elements:

1

2

3

Sample output:


Single digit even number is: 2


*/

import java.util.*;
class Evennumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        int a[]=new int[n];
       
    
        int c=0;
        if(n>0)
        {
             System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            
            if(a[i]%2==0&&a[i]%10==a[i])
            {
                System.out.println("Single digit even number is: "+a[i]);
            }
           
        }
        for(int i=0;i<n;i++)
        {
             if(a[i]%10!=a[i])
            {
                c=c+1;
            }
        }
        if(c==n)
        {
            System.out.println("Single digit even number is not found in the array");
        }
        }
        else
        {
            System.out.println("Invalid array size");
        }
       
    }
}    
