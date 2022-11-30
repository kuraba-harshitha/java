/*There are 3 labs in the CSE department (L1, L2 and L3) with a seating capacity of x, y and z. find the lab which has the minimal seating capacity. 

Input and Output Format:

Assume that x, y and z are always distinct.

Refer sample input and output. 

Note:

All text in bold corresponds to input and the rest corresponds to output.

Sample Input and Output 1:

Enter x

30

Enter y

40

Enter z

20

L3 has the minimal seating capacity

*/
import java.util.Scanner;
public class Lab
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x");
        int x=sc.nextInt();
        System.out.println("Enter y");
        int y=sc.nextInt();
        System.out.println("Enter z");
        int z=sc.nextInt();
        
        if(x<y&&y<z)
        {
            System.out.println("L1 has the minimal seating capacity");
        }
        else if(y<z)
        {
            System.out.println("L2 has the minimal seating capacity");
        }
        else
        {
            System.out.println("L3 has the minimal seating capacity");
        }
    }
}
