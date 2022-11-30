/*Program to check whether a number is a Harshad number or not (Niven number) is discussed here. Harshad Number is an integer that is divisible by the sum of its digits.

 Input format:

Input consists of 1 integer.
If the given number is Harshad Number display Harshad Number or display Not Harshad Number.
Sample Input:

1729

 Sample Output:

Harshad Number

*/
import java.util.Scanner;
public class Harshard
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=0,s=0,a1=0;
        a1=a;
        while(a>0)
        {
            r=a%10;
            s=s+r;
            a=a/10;
        }
        if(a1%s==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
             System.out.println(" Not Harshad Number");
        }
    }
}
