package task2ArraysAndStrings;

import java.util.Scanner;

class ReverseStringByInBuilt
{
	public void reverseStringByIbuilt()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the string you want to reverse by using InBuilt Methods:");
	
	String str=scan.nextLine();
	
	System.out.println(str);
	
	StringBuilder reverseString=new StringBuilder(str).reverse();
	System.out.println(reverseString);
	
	}
	
	
}

public class ReversingStringUsingInBuiltMethod 
{

	public static void main(String[] args) 
	{
		ReverseStringByInBuilt rsb=new ReverseStringByInBuilt();
		rsb.reverseStringByIbuilt();

	}

}
