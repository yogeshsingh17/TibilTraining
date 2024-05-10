package task2ArraysAndStrings;

import java.util.Scanner;

class ArrayBetweenTwoNumbers
{
	public void arrayBetweenTwoNumbers()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the starting number of the array:");
		
		int x=scan.nextInt();
		
		System.out.println("Enter the ending number of the array:");
		
		int y=scan.nextInt();
		
		int size=y-x;
		
		System.out.println("The size of the array is: " + size);
		
		int [] number=new int[size];
		
		System.out.println("Enter the elements of the array: ");
		
		
		for(int i=0;i<number.length;i++)
		{
			if(scan.hasNextInt())
			{
				number[i]=scan.nextInt();
			}
		}
		
		System.out.println("The elements of the orignal array are as follows: ");
		
		for(int i=0;i<number.length;i++)
		{
			System.out.print(number[i] + " ");
		}
	}
}


public class ArrayBetweenTwoNumbersInJava 
{

	public static void main(String[] args) 
	{
		ArrayBetweenTwoNumbers num=new ArrayBetweenTwoNumbers();
		num.arrayBetweenTwoNumbers();

	}

}
