/*Remove Array Deque Elements
Requested files: Main.java (Download)
Type of work: Individual work
Write a program in collection to print the following output:


Remove elements using the remove(), removeFirst(), removeLast() method

remove() - returns and removes an element from the first element of the array deque
remove(element) - returns and removes the specified element from the head of the array deque
removeFirst() - returns and removes the first element from the array deque (equivalent to remove())
removeLast() - returns and removes the last element from the array deque
Sample Output: 


ArrayDeque: [Dog, Cat, Cow, Horse]
Removed Element: Dog
New ArrayDeque: [Cat, Cow, Horse]
Removed First Element: Cat
Removed Last Element: Horse
*/
import java.util.ArrayDeque;

class Main
{
    public static void main(String[] args)
    {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Horse");
        System.out.println("ArrayDeque: " + animals);
        String element = animals.remove();
        System.out.println("Removed Element: " + element);
        System.out.println("New ArrayDeque: " + animals);
        String firstElement = animals.removeFirst();
        System.out.println("Removed First Element: " + firstElement);
        String lastElement = animals.removeLast();
        System.out.println("Removed Last Element: " + lastElement);
    }
}

