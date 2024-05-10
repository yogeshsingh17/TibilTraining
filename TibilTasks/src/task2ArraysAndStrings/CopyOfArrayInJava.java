package task2ArraysAndStrings;

import java.util.Scanner;

class CopyOfArray
{
	public void copyOfArray()
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size of the array: ");
		
		int arrSize=sc.nextInt();
	    
	    int[] arr = new int[arrSize];
	    
	    System.out.println("Enter the elements of the array:");
	    
	    for (int i = 0; i < arrSize; i++) 
	    {
	    	if (sc.hasNextInt()) 
	    	{
	    		arr[i] = sc.nextInt();
	        }
	    }
	 
	    System.out.println("The elements of the original array are:");
	    
	    for (int i = 0; i < arrSize; i++) 
	    {
	    	System.out.print(arr[i] + " ");    
	    }
	    
	    int [] arr1 =new int[arr.length];
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr1[i]=arr[i];
	    }
	    
	    System.out.println();
	    
	    System.out.println("The copy of orignal array is as follows:");
	    
	    for(int i=0;i<arr1.length;i++)
	    {
	    	System.out.print(arr1[i] + " ");
	    }
	    
	}
}

public class CopyOfArrayInJava 
{

	public static void main(String[] args) 
	{
		CopyOfArray coa=new CopyOfArray();
		coa.copyOfArray();

	}

}
