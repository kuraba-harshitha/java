/*
Write a program to find which department students placed for the max in the college. 

Sample Input:

Enter the no of students placed in CSE:

25

Enter the no of students placed in ECE:

26

Enter the no of students placed in MECH:

24

Sample Output:

Highest placement 

ECE
*/

import java.util.Scanner;
public class Placement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int a=sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int b=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int c=sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("Highest placement\nCSE");
        }
        else if(b>c)
        {
           System.out.println("Highest placement\nECE"); 
        }
        else
        {
            System.out.println("Highest placement\nMECH");
        }
    }
}
