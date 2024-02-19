package basicTasks;

import java.util.*;

public class Leapyear 
{

	public static void main(String[] args) 
	{
		//int baseYear=1967;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the year you want to check is a leap year or not");
		int num=scan.nextInt();
		
		if((num)%4==0)
		{
			System.out.println("The year is a leap year");
		}
		
		

	}

}
