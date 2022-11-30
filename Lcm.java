/*Write a program to find LCM of two numbers is discussed here. Two numbers are obtained as input and the prime factors of both the numbers are found. The product of the union of prime factors of both the numbers gives the LCM of the two numbers.

Input & Output Format:

Input consists of two integers.

Output consists of the lcm of two numbers.

Sample Input:

5

30

Sample Output:

LCM of 5 and 30 is 30*/
import java.util.Scanner;
public class Lcm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int max,x,lcm=0;
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        if(a>b)
        {
            max=x=a;
        }
        else
        {
            max=x=b;
        }
        while(a!=0)
        {
            if(max % a==0 && max % b==0)
            {
                lcm=max;
                break;
            }
            max +=x;
        }
        System.out.print("LCM of " + a + " and " + b + " is " +lcm);
    }
}
