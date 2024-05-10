package task2ArraysAndStrings;

import java.util.Scanner;

class ReverseStringByRecursion
{
	public void reverseStringByRecursion()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the string you want to reverse:");
		
		String str=scan.nextLine();
		
		System.out.println("The string is: " + str);
		
		String reverseString=reverse(str);
		
		System.out.println(reverseString);
		
	}
	
	public String reverse(String str)
	{
		
		if(str.isEmpty() || str.length()==1)
		{
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0) ;
	}
}

public class ReversingStringUsingRecursion 
{

	public static void main(String[] args) 
	{
		ReverseStringByRecursion rsr=new ReverseStringByRecursion();
		rsr.reverseStringByRecursion();
	}

}
