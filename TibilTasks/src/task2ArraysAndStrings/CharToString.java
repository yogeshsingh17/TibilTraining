package task2ArraysAndStrings;

import java.util.Scanner;
import java.util.StringTokenizer;

class StringToChar
{
	public void stringToChar()
	{
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Please enter the string you want to convert into char:");
		String a=scan.next();
		
		char [] b= a.toCharArray();
		
		System.out.println(a);
		for(char c:b)
		{
			System.out.println(c);
		}
		
		System.out.println();
		
		
		System.out.println("Please enter the characters you want to convert to string:");
		char ch=scan.next().charAt(0);
		
		String charToString= String.valueOf(ch);
		
		System.out.println(charToString);
		
	}

}

public class CharToString 
{

	public static void main(String[] args) 
	{
		StringToChar stc=new StringToChar();
		stc.stringToChar();

	}

}
