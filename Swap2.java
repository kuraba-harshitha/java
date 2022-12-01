/*Write a program to get 2 numbers from the user and swap their values without any loss of data. You can make use of an additional 3rdvariable for swapping. Print the corresponding swapped values of the two numbers as output in the console. 

Input format: 

First input: an integer 

Second input: an integer 

Output format: 

The output will be integers(swapped values)

Sample Input:

20

10

Sample Output:

10

20*/
import java.util.*;
public class Swap
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Swap1 r=new Swap1();
        r.sort(a,b);
    }
}
class Swap1
{
    public static int sort(int a,int b)
    {
        int t;
        t=a;
        a=b;
        b=t;
        System.out.printf("%d\n%d",a,b);
        return 0;
    }
}
