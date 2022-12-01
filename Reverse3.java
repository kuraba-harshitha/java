/*Complete the solution so that it reverses the string passed into it.

INPUT-1:

world

OUTPUT-1:

dlrow

*/
import java.util.*;
public class Reverse
{
   public static void main(String[] args)
   {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c;
        String s1=" ";
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            s1=c+s1;
        }
        System.out.println(s1);
   }
}
