/*Solve the pattern in dynamic:

 

Sample input 1:

5

Sample output 1:

*   *

 * *

  *

 * *

*   *

*/import java.util.Scanner;
public class Apattern1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=(n*2-1);i++)
        {
            for (int j=1;j<=n;j++)
            {
                if(j==i||j==n-i+1)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
