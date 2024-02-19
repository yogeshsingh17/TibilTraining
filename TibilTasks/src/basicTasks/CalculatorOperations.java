
/**
 * Creation of dynamic calculator in java using basic concepts.
 */

package basicTasks;

import java.util.Scanner;

public class CalculatorOperations 
{

	public static void main(String[] args) 
	{
		//to accept the input dynamically we use scanner.
		Scanner scan=new Scanner(System.in);
		
		//Accepting the first integer from the user
		System.out.println("Enter the First number");
		double num1=scan.nextDouble();
		
		//Accepting the second character from the user
		System.out.println("Enter the second number");
		double num2=scan.nextDouble();
		
		//Accepting the operation which needs to be performed on number provided.
		System.out.println("Enter the operation need to be performed from the following +,-,*,/,% ");
		char operator=scan.next().charAt(0);
		
		/*
		 * Note: To accept the character/ symbol dynamically we use next().charAt();
		 * next() is used to return the next word in the input.
		 * charAt() is used to return the next character in the string.
		 */
		
		//Using nested if else to perform the operation.
		if(operator == '+')
		{
			System.out.println("The addition of two numbers is: ");
			System.out.print(num1 + num2);
		}
		else if(operator == '-')
		{
			System.out.println("The subtraction of two numbers is: ");
			System.out.println(num1 - num2);
		}
		else if(operator == '*')
		{
			System.out.println("The multiplication of two numbers is: ");
			System.out.println(num1 * num2);
		}
		else if(operator == '/')
		{
			System.out.println("The division of two numbers is: ");
			double res=num1/num2;
			System.out.println(res);
		}
		else if(operator == '%')
		{
			System.out.println("The remainder of two numbers is: ");
			System.out.println(num1 % num2);
		}
		else
		{
			System.out.println("Wrong input please try again");
		}
		
		
		

	}

}
