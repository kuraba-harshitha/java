/*A microwave oven manufacturer recommends that when heating two items, add 50% to the heating time, and when heating three items double the heating time. Heating more than three items at once is not recommended. Write a program that asks the user for the number of items and the single-item heating time. The program then writes out the recommended heating time.

Input Format:

The first input is an integer which corresponds to the number of items. The second integer is a float which corresponds to the single item heating time.

Output Format:

Refer sample input and output for further formatting specifications.

Note:All text in bold corresponds to input and the rest corresponds to output

Sample Input and Output 1:

Enter the number of items

2

Enter the single item heating time

5.0

The recommended heating time is 7.50

 Sample Input and Output 2:

Enter the number of items

4

Enter the single item heating time

5.0

Number of items is more

*/
import java.util.Scanner;
public class Microwave
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of items");
        float n=sc.nextFloat();
        System.out.println("Enter the single item heating time");
        float h=sc.nextFloat();
        if(n==2)
        {
            System.out.printf("The recommended heating time is %.2f",(150*h)/100);
        }
        else if(n==3)
        {
            System.out.printf("The recommended heating time is",(200*h)/100);
        }
        else
        {
            System.out.printf("Number of items is more");
        }
    }
}
