/*Dora is interested so much in gardening and she plants more trees in her garden. She plants trees in a rectangular fashion with the order of rows and columns and numbered the trees in row-wise order. She planted the mango tree only in a 1st row, 1st column and last column. So given the tree number, your task is to find whether the given tree is a mango tree or not? Write a program to check whether the given number is a mango tree or not. 

Input format: 

Input consists of 3 integers 

The first input denotes the number of rows 

The second input denotes the number of columns 

The third input denotes the tree number 

Output format:

 If the given number is a mango tree, print "Yes". 

Otherwise, print "No" 

Refer the sample output for formatting

Sample Input:

5

5

11  

Sample Output:

Yes

*/
import java.util.Scanner;
public class Garden
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int t=sc.nextInt();
        if((r>=0&&r<c)||(t%c==0)||(t%c==1))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
         
    }
}
