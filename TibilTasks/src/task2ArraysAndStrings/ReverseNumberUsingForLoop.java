package task2ArraysAndStrings;

import java.util.*;

class ReverseOfNumberByForLoop
{
	public void reverseNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number you want to reverse:");
		
		int num=scan.nextInt();
		
		System.out.println("The number is:" + num);
		
		int reverseNum=0;
		
		for(;num!=0;num/=10)
		{
			int remainder=num%10;
			reverseNum=reverseNum*10+remainder;
		}
		
		System.out.println(reverseNum);
		
		
	}
}

public class ReverseNumberUsingForLoop 
{

	public static void main(String[] args) 
	{
		ReverseOfNumberByForLoop rnl=new  ReverseOfNumberByForLoop();
		rnl.reverseNumber();

	}

}
