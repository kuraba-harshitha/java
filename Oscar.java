/*You have to write a function that describe Leo:

if oscar was (integer) 88, you have to return "Leo finally won the oscar! Leo is happy".
if oscar was 86, you have to return "Not even for Wolf of wallstreet?!"
if it was not 88 or 86 (and below 88) you should return "When will you give Leo an Oscar?"
if it was over 88 you should return "Leo got one already!"

INPUT 1:

85

OUTPUT 1:

When will you give Leo an Oscar?

*/
import java.util.Scanner;
public class Oscar
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==88)
        {
            System.out.println("Leo finally won the oscar! Leo is happy");
        }
        else if(n==86)
        {
            System.out.println("Not even for Wolf of wallstreet?!");
        }
        else if(n==88||n<=86)
        {
            System.out.println("When will you give Leo an Oscar?");
        }
        else if(n>88)
        {
            System.out.println("Leo got one already!");
        }
    }
}
