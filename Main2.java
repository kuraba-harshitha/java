/*Check whether a stack is empty or not?
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

To check whether a stack is empty or not, we use the empty() method.
Sample Output: 
Stack: [Dog, Horse, Cat]
Is the stack empty? false*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Stack<String> stack=new Stack<>();
        stack.push("Dog");
        stack.push("Horse");
        stack.push("Cat");
        System.out.println("Stack: "+stack);
        System.out.println("Is the stack empty?: "+stack.empty());
    }
}
