/*Implementation of the Queue Interface
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

Sample Output: 
Queue: [1, 2, 3]
Accessed Element: 1
Removed Element: 1
Updated Queue: [2, 3]*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Queue: "+q);
        System.out.println("Accessed Element: "+q.peek());
        System.out.println("Removed Element: "+q.remove());
        System.out.println("Updated: "+q);
        
        
    }
}
