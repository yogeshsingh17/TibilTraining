
/**
 * Program to check whether a number within the range of 2 numbers is divisible by 3 or not. 
 */

package basicTasks;

import java.util.*;

public class NumbersDivisibleby3 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		//Accepting the range of integers from the user
		System.out.println("Enter the first no.");
		int i=scan.nextInt();
		
		System.out.println("Enter the second no.");
		int j=scan.nextInt();
		
		//Accepting the number which is to be checked if it is divisible by 3 or not.
		System.out.println("Enter the number to check if it is divisible by 3 or not");
		int num=scan.nextInt();
		
		//for loop to check whether a number is within the provided range or not
		for(;num>=i;)
		{
			for(;num<=j;)
			{
				if(num%3==0)
				{
					System.out.println("The number is divisible by 3");
					break;
				}
				else
				{
					System.out.println("The number is not divisible by 3");
				}break;
			}break;
		}

	}

}
