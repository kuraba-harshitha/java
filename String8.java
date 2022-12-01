/*Write a program to change the given string to lowercase without using string library functions: 

INPUT & OUTPUT FORMAT: 

Input consists of 1 string. 

Output print the Lowercase of given string.

Sample Input:
CYFUNO

Sample Output:

cyfuno*/
import java.util.Scanner;
public class String8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s=s1.toLowerCase(); 
        System.out.println(s);
    }
}
