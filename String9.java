/*Write a program to find whether the given string is palindrome or not without using string library functions: 

 INPUT & OUTPUT FORMAT: 

Input consists of 1 string. If the given string is a Palindrome display “palindrome”, else display “Not a Palindrome”.

Sample Input:
liril

Sample Output:
palindrome

*/
import java.util.Scanner;
public class String9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=" ";
        char a;
        for( int i=s.length()-1;i>=0;i--)
        {
           a=s.charAt(i);
           s1=s1+a;
        }
     int count=0;
     for(int j=0;j<s.length();j++)
     {
         if(s.charAt(j)==s1.charAt(j))
         {
             count++;
         }
     }
     if(count==s.length())
     {
         System.out.println("palindrome");
     }
     else
     {
         System.out.println("Not a Palindrome");
     }
    }
}
