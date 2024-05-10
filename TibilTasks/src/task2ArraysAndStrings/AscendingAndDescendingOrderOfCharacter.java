package task2ArraysAndStrings;

import java.util.Scanner;

class AscendingAndDescendingOrderOfChar
{
	public void ascendingAndDescendingOrderOfChar()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no. of characters you want to add: ");
		
		int sizeChar=scan.nextInt();
		
		System.out.println("The size of the character array is: " + sizeChar);
		
		char [] c=new char[sizeChar];
		
		System.out.println("Enter the character of the array:: ");
		
		for(int i=0;i<c.length;i++)
		{
			if(scan.hasNextLine())
			{
				c[i]=scan.next().charAt(0);
			}
		}
		
		System.out.println("The char array is as follows: ");
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("The char array is reverse is as follows:");
		
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.println(c[i] + " ");
		}
	}
}

public class AscendingAndDescendingOrderOfCharacter 
{

	public static void main(String[] args) 
	{
		AscendingAndDescendingOrderOfChar ch=new AscendingAndDescendingOrderOfChar();
		ch.ascendingAndDescendingOrderOfChar();

	}

}
