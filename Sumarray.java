/*Write a  program to find the sum of elements in an array.

Sample Input:

3
1
2
3

Sample Output:
6*/
import java.util.Scanner;
public class Sumarray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            s=s+a[i];
        }
        System.out.println(s);
    }
}
