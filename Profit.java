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
import java.util.Scanner;
public class Profit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       float sp,cp,p,total;
       cp=sc.nextFloat();
       sp=sc.nextFloat();
       p=cp/12;
       if(p>sp)
       {
           total=(p-sp)*12;
           System.out.println("Enter the price of a dozen mangoes");
           System.out.println("Enter the price at which 1 mango is being sold");
           System.out.printf("Loss : Rs.%.2f",total);
       }
       else if(p==sp)
       {
           total=(p-sp)*12;
           System.out.println("Enter the price of a dozen mangoes");
           System.out.println("Enter the price at which 1 mango is being sold");
           System.out.printf("No profit nor loss");
           
       }
       else
       {
           total=(sp-p)*12;
           System.out.println("Enter the price of a dozen mangoes");
           System.out.println("Enter the price at which 1 mango is being sold");
           System.out.printf("profit : Rs.%.2f",total);
       }
       
    }
}
