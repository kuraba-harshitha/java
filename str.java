/*Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".
*/
import java.util.Scanner;
public class str
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Hello "+name+" how are you doing today?");
    }
}
