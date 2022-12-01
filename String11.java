/*Given a string s, find the length of the longest prefix, which is also a suffix. The prefix and suffix should not overlap.

Examples: 

Input : aabcdaabc
Output : 4
The string "aabc" is the longest
prefix which is also suffix.

Input : abcab
Output : 2

Input : aaaa
Output : 2
*/

import java.util.Scanner;
public class String1
{
	public static int Str(String s)
{
	int n = s.length();
	if(n < 2) {
		return 0;
	}

	int len = 0;
	int i = (n + 1)/2;
	while(i < n)
	{
		if(s.charAt(i) == s.charAt(len))
		{
		++len;
		++i;
		}
		else
		{
		i = i - len + 1;
		len = 0;
		}
	}

	return len;

}
	
public static void main (String[] args)
{Scanner sc=new Scanner(System.in);
	String s = sc.next();
	System.out.println(Str(s));
}
}
