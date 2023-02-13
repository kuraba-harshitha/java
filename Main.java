/*Remove an element from the top of the stack
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

To remove an element from the top of the stack, we use the pop() method. 
Sample Output: 

Initial Stack: [Dog, Horse, Cat]
Removed Element: Cat*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Stack<String> stack=new Stack<>();
        stack.push("Dog");
        stack.push("Horse");
        stack.push("Cat");
        System.out.println(" Initial Stack: "+stack);
        System.out.println("Removed Element: "+stack.pop());
    }
}

