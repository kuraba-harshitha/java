/*Write a program to find the reverse of the given without string using string library functions: 

Input & Output Format:

Input consists of 1 string.

Output consists of reversed string.

Sample Input:
cyfuno

Sample Output:

onufyc*/
import java.util.Scanner;
public class String4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s1=" ";
        char a;
        for( int i=str.length()-1;i>=0;i--)
        {
           a=str.charAt(i);
           s1=s1+a;
        }
        System.out.println(s1);
    }
}
