/*Write a program to find the maximum element in an array:

Sample Input:
5
1
2
33
4
5

Sample Output:
33*/
import java.util.Scanner;
public class Max
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
            System.out.println(max);
    }
}
