package task2ArraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

class MaxAndMin
{
	public void maxAndMin()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		
		int size=scan.nextInt();
		
		System.out.println("The size of the array is: " + size);
		
		int [] a=new int[size];
		
		System.out.println("Enter the elements of the array: ");
		
		
		for(int i=0;i<a.length;i++)
		{
			if(scan.hasNextInt())
			{
				a[i]=scan.nextInt();
			}
		}
		
		System.out.println("The elements of the origmal array are as follows: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		
		Arrays.sort(a);
		
		System.out.println();
		
		System.out.println("The sorted array is as follows: ");
				
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("The maximun and minimun elements of the array are as follows:");

		System.out.println("Max: " + a[a.length-1]);
		
		System.out.println("Min: " + a[0]);
		
		scan.close();
		
	}
}


public class MaxAndMinOfArrayInJava 
{

	public static void main(String[] args) 
	{
		MaxAndMin mam=new MaxAndMin();
		mam.maxAndMin();

	}

}
