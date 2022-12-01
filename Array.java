/*
Write a program to input 10 numbers in an array and display only the even numbers if present in the array.

Sample Input:

Enter 10 numbers


11
15
28
31
49
54
72
81
93
14
Sample Output: 
List of even numbers
28 54 72 14
*/

import java.util.Scanner;
public class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
         System.out.println("List of even numbers");
        for(int i=0;i<10;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(" "+a[i]);
            }
        }
    }
}
