/*Write a program to count the number of vowels in the given string: 

 INPUT & OUTPUT FORMAT:

Input consists of 1 string. 

Output print the number of Vowels.

Sample Input:
cyfuno

Sample Output:

2

*/
import java.util.Scanner;
public class String10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
