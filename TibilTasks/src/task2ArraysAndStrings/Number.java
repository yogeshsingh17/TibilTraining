package task2ArraysAndStrings;

import java.util.Scanner;

class Digit
{
	  public int reverseUsingRecursion(int number, int reverseNumber) 
	  {
		  
	        if (number == 0) 
	        {
	            return reverseNumber;
	        } else 
	        {
	            reverseNumber = reverseNumber * 10 + (number % 10);

	            return reverseUsingRecursion(number / 10, reverseNumber);
	        }
	  }
}

public class Number 
{

	public static void main(String[] args) 
	{
		Digit d=new Digit();
		
		System.out.println("Enter the no. to be reversed:");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		
		int reverseNumber=0;
		
		System.out.println("The original number is: " + number);
		System.out.print("The reeversed number is: ");
		System.out.print(d.reverseUsingRecursion(number,reverseNumber));
		
		scan.close();

	}

}
