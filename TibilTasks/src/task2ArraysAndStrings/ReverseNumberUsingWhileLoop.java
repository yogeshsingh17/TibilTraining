package task2ArraysAndStrings;

import java.util.Scanner;

class ReverseNumberByWhileLoop
{
	public void reverseNumberByWhileLoop()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number you want to reverse:");
		
		int number=scan.nextInt();
		
		System.out.println("The number is: " + number);
		
		int reverseAfterReverse=reverse(number);
		
		System.out.println(reverseAfterReverse);
		
	}
	
	public int reverse(int number)
	{
		int reverseNumber=0;
		
		while(number>0)
		{
			int remainder=number%10;
			reverseNumber=reverseNumber*10 + remainder;
			number=number/10;
		}
		return reverseNumber;
	}
}

public class ReverseNumberUsingWhileLoop
{

	public static void main(String[] args) 
	{
		ReverseNumberByWhileLoop rwl=new ReverseNumberByWhileLoop();
		rwl.reverseNumberByWhileLoop();
		
	}

}
