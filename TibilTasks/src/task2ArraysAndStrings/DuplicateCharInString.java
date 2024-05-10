package task2ArraysAndStrings;

import java.util.Scanner;

class DuplicateChar
{
	public void duplicateChar()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the String:");
		String str=scan.next();
		
		System.out.println("The string is: " + str);
		
		char [] c=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(c[i]==c[j])
				{
					System.out.println(c[i]);
				}
			}
		}

	}
}

public class DuplicateCharInString 
{

	public static void main(String[] args) 
	{
		DuplicateChar dc=new DuplicateChar();
		dc.duplicateChar();

	}

}
