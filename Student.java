/*
In school, the teacher wants to calculate the subject marks of the student. she can do it by manual but the number of students in the class was around 250. she wants to calculate the specific subject marks for individual students in the class. Because she wanted to highlight the important subject marks to their parents in the parents-teachers association meeting. Can you help her to calculate the subject marks by writing code in java program?

Input Format

First line consist of student roll number.

second and third lines consist of subject1 and subject2 marks.

Output Format

Total marks of subjects.

Sample Input

5

10

20

Sample Output

Roll Number Is:

5

Subject 1:10

Subject 2:20

Total:30
*/


import java.util.Scanner;
public class Student
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int t=s1+s2;
        System.out.println("Roll Number Is:"+n);
        System.out.println("Subject 1:"+s1);
        System.out.println("Subject 2:"+s2);
        System.out.println("total:"+t);
    }
}
