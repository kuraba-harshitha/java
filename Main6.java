/*Remove PriorityQueue Elements
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

remove() - removes the specified element from the queue
poll() - returns and removes the head of the queue

Sample Output: 
PriorityQueue: [1, 4, 2]
Is the element 2 removed? true
Removed Element Using poll(): 1*/

import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {

        
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.println("PriorityQueue: " + numbers);
        boolean result = numbers.remove(2);
        System.out.println("Is the element 2 removed? " + result);
        int number = numbers.poll();
        System.out.println("Removed Element Using poll(): " + number);
    }
}
