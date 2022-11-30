/*Program to check whether the given number is a Palindrome or  Not a Palindrome is discussed here. Any number is said to be a palindrome if the original number and the reverse of the original number are the same.

For example, 1234321 is a palindrome.

Original number = 1234321

The reverse of the number = 1234321

Sample Input:
454

Sample Output:

Palindrome*/
import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,n1,s=0;
        n1=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(n1==s)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
