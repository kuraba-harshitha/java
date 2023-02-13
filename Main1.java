/*Search an element in the stack
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

To search an element in the stack, we use the search() method. It returns the position of the element from the top of the stack. 
Sample Output: 
Stack: [Dog, Horse, Cat]
Position of Horse: 2
*/
//Code here
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
        System.out.println("Position of Horse: "+stack.search("Horse"));
    }
}
