//Anagram String
/*
	Two strings are called anagrams if they contain same set of characters but in different order.

"keep ? peek", "Mother In Law - Hitler Woman".
Adding this line to check modification in git
*/

import java.util.*;
public class Anagram
{
	public static void isAnagram(String str1,String str2)
	{
		String s1=str1.replaceAll(" ","");
		String s2=str2.replaceAll(" ","");

		boolean status=true;
		if(s1.length() != s2.length())
		{
			status=false;
		}
		else
		{
			char[] charArray1=s1.toLowerCase().toCharArray();
			char[] charArray2=s2.toLowerCase().toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			status=Arrays.equals(charArray1,charArray2);
		}
		if(status)
			System.out.println("anagram strings");
		else
			System.out.println("not an anagram strings");
	}
	public static void main(String args[])
	{
		isAnagram("peep","keep");
	}
}