package basicTasks;

import java.util.Scanner;

class CollegeStudent
{
	public void studentOperations()
	{
		String [] subjects= {"Maths","Physics","Chemistry","Computer Science","English"};
		
		Scanner scan=new Scanner(System.in);
		
		int minMarks=0;
		int maxMarks=100;
		
		int marks=0;
		
		int totalMarks=0;
		
		int i=0;
		

		//for(int i=0;i<subjects.length;i++)
		while(i<subjects.length)
		{
			System.out.println("Please enter your marks in " + subjects[i]);
			marks=scan.nextInt();
			
			if(marks>=minMarks && marks<=maxMarks)
			{
				System.out.println("Marks in " + subjects[i] + " is " + marks);
				
				totalMarks+=marks;
				

			}
			else
			{
				System.out.println("Please enter the marks between the range of 0-100");
				break;
			}
		
			i++;
			
		}
		
		
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

public class GradeOfStudent1 
{

	public static void main(String[] args) 
	{
			CollegeStudent cs=new CollegeStudent();
			cs.studentOperations();

	}

}
