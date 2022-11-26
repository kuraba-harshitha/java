/*ASCII - American Standard Code for Information Interchange. Write a program to get a number(ASCII) as input and print its equivalent character. You can display a character if you know ASCII code of that character. 

Sample Input:

103

Sample Output:

g*/
import java.util.Scanner;
public class Ascii
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     char c=(char)n;
     System.out.println(c);
    }
}
