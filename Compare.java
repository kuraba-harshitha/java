/*Get two integers a and b from the user and write a program to relate 2 integers as equal to, less than or greater than. 

Input format: 

Input consist of 2 integers 

The first input corresponds to the first number(a) 

The second input corresponds to the second number(b) 

Output format: 

If the first number is equal to the second number, print "a is equal to b". 

Otherwise, print "a greater than b" or "a less than b"

Sample Input: 

17

12

Sample Output: 

17 greater than 12*/
import java.util.Scanner;
public class Compare
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int a,b;
       a=sc.nextInt();
       b=sc.nextInt();
       if(a==b)
       {
           System.out.println(a + " is equal to " + b);
       }
       else if(a>b)
       {
           System.out.println(a + " is greater than " + b);
       }
       else
       {
           System.out.println(a + " is less than " + b);
       }
       
    }
}
