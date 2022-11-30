/*The newly appointed Vice Chancellor of Anna University wanted to create a automated grading system for the students to check their grade. When a student enter a mark, the grading system displays the corresponding grade.

Write a program to solve the given problem.

 

Marks scored

Grade

100

S

(90,100)

A

(80,90)

B

(70,80)

C

(60,70)

D

(50,60)

E

<50

F


The interval [a,b) includes all numbers greater than or equal to a and less than b.

 Input and Output Format:

Input consists of a single integer which corresponds to the marks scored by the student. Print Invalid Input if it is not in the range 0 to 100.

Refer sample input and output for formatting specifications.

Sample Input 1:

85

Sample Output 1:

B

Sample Input 2:

850

Sample Output 2

Invalid Input

*/
import java.util.Scanner;
public class Grade
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      char grade;
      n=sc.nextInt();
      if(n==100)
      {
          System.out.println(grade='S');
      }
      else if(n>=90 && n<=100)
      {
          System.out.println(grade='A');
      }
      else if(n>=80 && n<=90)
      {
          System.out.println(grade='B');
      }
      else if(n>=70 && n<=80)
      {
          System.out.println(grade='C');
      }
      else if(n>=60 && n<=70)
      {
          System.out.println(grade='D');
      }
      else if(n>=50 && n<=60)
      {
          System.out.println(grade='E');
      }
      else if(n<50)
      {
          System.out.println(grade='F');
      }
      else
      {
          System.out.println("Invalid Input");
      }
    }
}
