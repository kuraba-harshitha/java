/*Implementing the PriorityQueue Class
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

Sample Output: 
Queue: [1, 5, 2]
Accessed Element: 1
Removed Element: 1
Updated Queue: [2, 5]*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Queue<Integer> q=new PriorityQueue<Integer>();
        q.add(1);
        q.add(5);
        q.add(2);
        System.out.println("Queue: "+q);
        System.out.println("Accessed Element: "+q.peek());
        System.out.println("Removed Element: "+q.remove());
        System.out.println("Updated Queue: "+q);
        
        
    }
}
