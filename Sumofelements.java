/*Input consists of 2 integers and 1 2D-array. 

Integers correspond to the size of rows and columns.

Output consists of 3 integers.

Output consists of the values which is the sum of all the rows.

Sample Input:

3
3
1 2 3
7 3 1
7 4 1

Sample Output:
6
11
12*/
import java.util.Scanner;
public class Sumofelements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int s=0;
        int a[][]=new int[r][c];
        int b[][]=new int[r][c]; 
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                s=a[i][j]+s;
            }
            System.out.println(s);
                s=0;
        } 
        
    }
}
