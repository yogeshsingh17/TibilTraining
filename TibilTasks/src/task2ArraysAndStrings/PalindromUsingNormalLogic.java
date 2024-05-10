package task2ArraysAndStrings;

public class PalindromUsingNormalLogic 
{

	public static void main(String[] args) 
	{
		String a="12321";
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		
		System.out.println(a);
		System.out.println(b);
		
		if(b.equals(a))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrol");
		}

	}
	
	

}
