/*Write a program to find whether the given two strings are same or not using string library functions:

INPUT & OUTPUT FORMAT:

Input consists of 2 strings. 

If two strings are same, display “Strings are same”, else display “Strings are not same”.

Sample Input:
hello 

hello 

Sample Output:
Strings are same

*/
import java.util.Scanner;
public class String5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.equals(s2))
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are not same");
        }
    }
}
