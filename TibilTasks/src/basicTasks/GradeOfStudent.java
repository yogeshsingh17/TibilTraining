package basicTasks;

import java.util.Scanner;

public class GradeOfStudent 
{

	public static void main(String[] args) 
	{
		String [] subjects= {"Maths","Physics","Chemistry","Computer Science","English"};
		
		//System.out.println();
		
		//System.out.println("Please select from the subjects given below:");
		
		//System.out.println("Maths, Physics, Chemistry, Computer Science, English");
		
		Scanner scan=new Scanner(System.in);
		
		int totalMarks=0;
		
		for(int i=0;i<subjects.length;i++)
		{
			System.out.println("Please enter your marks in " + subjects[i]);
			
			int marks=scan.nextInt();
			
			System.out.println("Marks in " + subjects[i] + " is " + marks);
			
			totalMarks+=marks;
			
		}
		
		System.out.println();
		
		double average=totalMarks/subjects.length;
		System.out.println("The average marks are: " + average);
		
		System.out.println();
		
		if(average>=80)
		{
			System.out.println("Your average marks are " + average + " resulting in Grade A");
		}
		else if(average<80 && average>=60)
		{
			System.out.println("Your average marks are " + average + " resulting in Grade B");
		}
		else if(average<60 && average>=40)
		{
			System.out.println("Your average marks are " + average + " resulting in Grade C");
		}
		else
		{
			System.out.println("Your average marks are " + average + " resulting in Grade D");
		}
		
		
		
		

	}

}
