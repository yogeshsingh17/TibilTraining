package task2ArraysAndStrings;

import java.util.Scanner;

class ReverseNumberByRecursion
{

	public int reverse(int num, int reverseNumber)
	{
		
		if(num==0)
		{
			return reverseNumber;
		}
		else
		{
			
			reverseNumber = reverseNumber * 10 + (num % 10);

            return reverse(num/ 10, reverseNumber);
			
		}

	}
	
}

public class ReverseNumberUsingRecursion 
{

	public static void main(String[] args) 
	{
		ReverseNumberByRecursion rr=new ReverseNumberByRecursion();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to be reversed: ");
		int num=scan.nextInt();
		
		int reverseNumber=0;
		
		
		System.out.println("The reverse number is: " + rr.reverse(num, reverseNumber));
		
		scan.close();
		

	}

}
