/*Create HashMap in Java
Requested files: Main.java (Download)
Type of work: Individual work
Write a program in collection to print the following output:
Sample Output: 
HashMap: {Java=8, JavaScript=1, Python=3}*/
import java.util.HashMap;
class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> languages = new HashMap<>();
    languages.put("Java", 8);
    languages.put("JavaScript", 1);
    languages.put("Python", 3);
    System.out.println("HashMap: " + languages);
  }
}
