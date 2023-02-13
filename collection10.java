/*Add elements to stack
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using collection to display the following output:

Methods: 

To add an element to the top of the stack, we use the push() method.
Sample Output: 

Stack: [Dog, Horse, Cat]
*/
import java.util.*;
public class collection
{
    public static void main(String args[])
    {
        Stack<String> stack=new Stack<String>();
        stack.push("Dog");
        stack.push("Horse");
        stack.push("Cat");
        System.out.println("Stack: "+stack);
    }
}
