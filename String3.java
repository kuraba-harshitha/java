/*Write a program to copy a string from one variable to other using string library functions: 

INPUT & OUTPUT FORMAT: 

Input consists of 1 string.

Output consists of 1 string.

Sample Input:
hello 

Sample Output:
hello

*/
import java.util.Scanner;
public class String3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
         String s=str;
        System.out.println(s);
    }
}
