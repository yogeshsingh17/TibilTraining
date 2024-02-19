package basicTasks;

import java.util.*;

class Calc
{
	Scanner scan=new Scanner(System.in);
	
	char exitCalc;
	
	public void calculations()
	{	
		
		//System.out.println("Press 'Y' to continue or press 'E' to exit");
		//exitCalc=scan.next().charAt(0);
		
		while(exitCalc!='e' || exitCalc!='E')
		{
			System.out.println("Please enter the first number");
			double num1=scan.nextDouble();
			
			System.out.println("Please enter the second number");
			double num2=scan.nextDouble();
			
			System.out.println("Please enter the operation needs to be performed +,-,*,/,%");
			char s=scan.next().charAt(0);
			
			switch(s)
			{
			case '+':
				System.out.println("The addition of two numbers is: " + (num1 + num2));
				break;
				
			case '-':
				System.out.println("The subtraction of two numbers is: " + (num1-num2));
				break;
				
			case '*':
				System.out.println("The multiplication of two numbers is: " + (num1*num2));
				break;
				
			case '/':
				System.out.println("The division of two numbers is: " + (num1/num2));
				break;
				
			case '%':
				System.out.println("The remainder after dividing the numbers is: " + (num1%num2));
				break;
				
				default:
					System.out.println("Please enter the correct operation which needs to be performed");
				
			}
			
			System.out.println("Press 'e' or 'E' to exit the calc or press 'Y' to continue");
			exitCalc=scan.next().charAt(0);
			
			
			if(exitCalc=='e' || exitCalc=='E')
			{
				break;
			}
			
		}
		
	}
	
}

public class CalculatorOperationsWithManualExitButton 
{

	public static void main(String[] args) 
	{
		Calc c=new Calc();
		c.calculations();

	}

}
