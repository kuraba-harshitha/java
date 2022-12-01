/*Write a program to count the number of even and odd elements in an array:

Sample Input:
3
1
2
3

Sample Output:
Odd: 2
Even: 1*/
import java.util.Scanner;
public class Count
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int count=0,count1=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                count++;
            }
            else
            {
                count1++;
            }
             
        }
         System.out.printf("Odd: %d\n",count1);
         System.out.printf("Even: %d\n",count);
    }
}

