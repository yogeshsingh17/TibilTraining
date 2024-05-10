package task2ArraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

class AscendingAndDescendingOrder
{
	public void ascendingAndDescendingOrder()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		
		int size=scan.nextInt();
		
		System.out.println("The size of the array is: " + size);
		
		int [] b=new int[size];
		
		System.out.println("Enter the elements of the array: ");
		
		
		for(int i=0;i<b.length;i++)
		{
			if(scan.hasNextInt())
			{
				b[i]=scan.nextInt();
			}
		}
		
		System.out.println("The elements of the origmal array are as follows: ");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i] + " ");
		}
		
		Arrays.sort(b);
		
		System.out.println();
		
		System.out.println("The array in ascending order is as follows: ");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("The array in descending order is as follows: ");
		
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.println(b[i]);
		}
		
	}
}

public class AscendingAndDescendingOrderOfArray 
{

	public static void main(String[] args) 
	{
		AscendingAndDescendingOrder asc=new AscendingAndDescendingOrder();
		asc.ascendingAndDescendingOrder();

	}

}
