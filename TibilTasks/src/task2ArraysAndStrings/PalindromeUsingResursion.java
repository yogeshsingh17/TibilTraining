package task2ArraysAndStrings;

import java.util.Scanner;

class Palindrome
{

	public int palindrome(int a,int rev)
	{
		if(a==0)
		{
			return rev;
		}
		else
		{
			rev=(rev*10)+(a%10);
			return palindrome(a/10,rev);
		}
	} 	
	
}

public class PalindromeUsingResursion 
{
	
	public static void main(String[] args) 
	{
		Palindrome pa=new Palindrome();
		System.out.println("Enter the digit you want to check is palindrome or not: ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		int rev=0;
		
		int j=pa.palindrome(a, rev);
		
		System.out.println("The number after recursion is: " + pa.palindrome(a, rev));
		
		if(j==a)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		
		scan.close();

	}

}