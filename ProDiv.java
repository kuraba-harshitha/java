/*Write a program to get 2 numbers from the user and calculate their product, quotient and remainder using '*', '/' and '%' operators respectively. Print the corresponding product, quotient and remainder of the numbers as output in the console. 

Input format: 

First input: an integer

Second input: an integer 

Output format: 

The first output will be the product of two integers 

The second output will be the quotient 

The third output will be the remainder

Sample Input:

50

10

Sample Output:

500

5

0
*/
import java.util.Scanner;
public class ProDiv
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e;
        a=sc.nextInt();
        b=sc.nextInt();
        c=a*b;
        d=a/b;
        e=a%b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
