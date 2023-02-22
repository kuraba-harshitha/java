/*Iterating Over a PriorityQueue
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

To iterate over the elements of a priority queue, we can use the iterator() method. In order to use this method, we must import the java.util.Iterator package. 


Sample Output: 
PriorityQueue using iterator(): 1, 4, 2,*/
import java.util.PriorityQueue;
import java.util.Iterator;

class Main {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.print("PriorityQueue using iterator(): ");
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) 
        {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
