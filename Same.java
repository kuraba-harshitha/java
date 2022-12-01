/*Write a  program to find whether two arrays are same or not. Two arrays are said to be same if the sum of both the arrays are same and size of arrays are same:

INPUT FORMAT:

Input consists of 2 integers and 2 arrays.

Integers correspond to the size of arrays.

If two arrays are same, display "Same" else display "Not Same"


Sample Input:
3
3
1
2
3
1
2
3

Sample Output:
Same

*/import java.util.Scanner;
public class Same
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a[]=new int[n1];
        int n2=sc.nextInt();
        int b[]=new int[n2];
        int c=0;
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n2;j++)
        {
            b[j]=sc.nextInt();
        }
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
               if(a[i]==b[j])
                c++;
                break;
            }
        }
        
           if(c==n1&&c==n2)
           {
              System.out.println("Same");
           }
           else
           {
              System.out.println("Not Same");
           }
    }
}
