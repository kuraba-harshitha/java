/*Dev went a tour to Goa with his friends. There they went for boating. The rule is that only restricted weight can travel in a boat at a time so that the boat remains stable in the boat. You find that the boatman who is sailing your boat is so much greedy in making money. For earning more money he takes many number of peoples to travel in the boat at a time. So you wants to check how much number of people can travel in the boat at a time so that the boat will not drown. Calculate the weight by considering the number of adults and number of children.

INPUT & OUTPUT FORMAT:

Input consists of 3 integers.

First input corresponds to the weight that the boat can handle.

Second input corresponds to the number of adults.

Third input corresponds to the number of children.

Output consists of a string.
If the boat can handle weight display "Boat is stable" or else display "Boat will drown"

Hint:

Adult: 75

Children: 50

Sample Input:
340

2

3
Sample Output:

Boat is Stable*/
import java.util.Scanner;
public class Assessment1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((a*75)+(b*50)<=w)
        {
            System.out.println("Boat is stable");
        }
        else
        {
            System.out.println("Boat is unstable");
        }
    }
}
