package basicTasks;

import java.util.Scanner;

public class NumberDivisibleByNumberWithinGivenRange 
{
	public void operations()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		int num1=scan.nextInt();
		
		System.out.println("Please enter the second number");
		int num2=scan.nextInt();
		
		System.out.println("Please enter the number by which you want to divide the numbers within the provided range");
		int num3=scan.nextInt();
		
		System.out.println("The numbderds divisible by " + num3 + " are: ");
		for(int i=num1;i<=num2;i++)
		{
			if(i%num3==0)
			{
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) 
	{
		NumberDivisibleByNumberWithinGivenRange i= new NumberDivisibleByNumberWithinGivenRange();
		i.operations();

	}

}
