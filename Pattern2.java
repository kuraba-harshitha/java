/*Write a Python program to print the given pattern from user-defined values(dynamic values)

Sample Input 1:
5
Sample Output 1:
11111
22222
33333
44444
55555

Sample Input 2:
7
Sample Output 2:
1111111
2222222
3333333
4444444
5555555
6666666
7777777 */
import java.util.Scanner;
public class Pattern2
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.printf("%d",i);
            }
            System.out.println();
        }
    }
}
