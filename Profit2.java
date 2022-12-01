/*A fruitseller buys a dozen mango at Rs.X. He sells 1 mango at Rs.Y. Write a program to determine the profit or loss in Rs. for the fruitseller.

 Input and Output Format:

Input consists of 2 floating point numbers which correspond to X and Y.

Refer sample input and output for formatting specifications. .

 Sample Input1:

60.0

4

Sample Output1:

Enter the price of a dozen mangoes

Enter the price at which 1 mango is being sold

Loss : Rs.12.00

Sample Input 2:

60.0

6

Sample Output 2:

Enter the price of a dozen mangoes

Enter the price at which 1 mango is being sold

Profit : Rs.12.00

Sample Input 3:

60.0

5

Sample Output 3:

Enter the price of a dozen mangoes

Enter the price at which 1 mango is being sold

No profit nor loss

*/
import java.util.*;
public class Profit
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of a dozen mangoes");
        float x=sc.nextFloat();
        System.out.println("Enter the price at which 1 mango is being sold");
        float y=sc.nextFloat();
        Profit1 p=new Profit1();
        p.loss1(x,y);
    }
}
class Profit1
{
    public static int loss1(float x,float y)
    {
       float a=x/12;
        float r=y*12;
        if(r>x)
            System.out.printf("Profit : Rs.%.2f",(r-x));
        else if(r<x)
          System.out.printf("Loss : Rs.%.2f",(x-r));  
        else
            System.out.printf("No profit nor loss"); 
            return 0;
    }
}
