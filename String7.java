/*Write a program to change the given string to uppercase without using string library functions: 

 INPUT & OUTPUT FORMAT: 

Input consists of 1 string. 

Output print the Uppercase of given string.

Sample Input:
cyfuno

Sample Output:

CYFUNO

*/
import java.util.Scanner;
public class String7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s=s1.toUpperCase(); 
        System.out.println(s);
    }
}
