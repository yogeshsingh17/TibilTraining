package task2ArraysAndStrings;

import java.util.Scanner;

class ReevrsingStringByLogic
{
	public void reversingString()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the string you want to reverse:");
		String str=scan.nextLine();
		
		System.out.println("The string is: " + str);
		
		StringBuilder reverse=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse.append(str.charAt(i));
		}
		
		System.out.println("The reversed string is: " + reverse);
		
	}
}

public class ReversingStringUsingLogic 
{

	public static void main(String[] args) 
	{
		ReevrsingStringByLogic rsl=new ReevrsingStringByLogic();
		rsl.reversingString();

	}

}
