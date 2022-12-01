/*Write a program to generate the following series 

Sample Input:

5

Sample Output:

3  2  11  14  27

*/
import java.util.Scanner;
public class Series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for(int i=1;i<=n;i++)
        {
          if(i%2==0)
          {
              a=i*i-2;
              System.out.print(" "+a);
          }
          else
          {
              a=i*i+2;
              System.out.print(" "+a);
          }
        }
        
    }
}
