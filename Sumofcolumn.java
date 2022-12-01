/*Write a  program to find the sum of elements in each column

INPUT & OUTPUT FORMAT: 

Input consists of 2 integers and 1 2D-array. 

Integers correspond to the size of rows and columns.

Output consists of the addition of  elements in each columns

Sample Input:
3
3
3 5 1
7 3 2
0 54 2

Sample Output:
10
62
5

*/
import java.util.Scanner;
public class Sumofcolumn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int s=0;
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                s=a[j][i]+s;
            }
            System.out.println(s);
                s=0;
        } 
    }
}
