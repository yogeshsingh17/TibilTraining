package task2ArraysAndStrings;

import java.util.*;

class SortingString
{
	public void sortingString()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the string you want to sort in alphabetical order:");
		String str=scan.nextLine();
		
		str=str.toLowerCase();
		
		System.out.println("The string is: " + str);
		
		char [] ch=str.toCharArray();
		
		Arrays.sort(ch);
		
		String s=new String(ch);
		System.out.println(s);
		
	}
}

public class SortingStringInAlphabeticalOrder 
{

	public static void main(String[] args) 
	{
		SortingString ss=new SortingString();
		ss.sortingString();

	}

}
