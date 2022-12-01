/*Write a program to find the length of the given string using string library functions:

INPUT & OUTPUT FORMAT:

Input consists of 1 string. 

Output print the length of the string.

Sample Input:
cyfuno

Sample Output:

6

*/
import java.util.Scanner;
public class String2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(str.length());
    }
}
