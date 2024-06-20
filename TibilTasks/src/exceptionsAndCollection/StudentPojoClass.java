package exceptionsAndCollection;

import java.util.Scanner;

//POJO class
class StudentPojo
{
	private String name;
	private int age;
	private long mobileNo;
	private String city;
	private String gender;
	private String schoolName;
	private int rollNo;
	
	public StudentPojo(String name, int age, long mobileNo, String city, String gender, String schoolName, int rollNo)
	{
		this.name=name;
		this.age=age;
		this.mobileNo=mobileNo;
		this.city=city;
		this.gender=gender;
		this.schoolName=schoolName;
		this.rollNo=rollNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public long getMobileNo()
	{
		return mobileNo;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String getSchoolName()
	{
		return schoolName;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	
}

class StudentPojoImplementation
{
	public void studentPojoImplementation()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		String name=scan.nextLine();
		
		System.out.println("Enter the age: ");
		int age=scan.nextInt();
		
		System.out.println("Enter the mobile number: ");
		long mobileNo=scan.nextLong();
		
		System.out.println("Enter the city: ");
		String city=scan.nextLine();
		
		System.out.println("Enter your gender: ");
		String gender=scan.next();
		
		System.out.println("Enter school name: ");
		String schoolName=scan.nextLine();
		
		System.out.println("Enter the roleNo: ");
		int rollNo=scan.nextInt();
		
		StudentPojo sp=new StudentPojo(name,age,mobileNo,city,gender,schoolName,rollNo);
		
		System.out.println("Student details: ");
		System.out.println("****************");
		
		System.out.println("Student name: " + sp.getName());
		System.out.println("Student age: " + sp.getAge());
		System.out.println("Student mobile No.: " + sp.getMobileNo());
		System.out.println("Student is living in " + sp.getCity() + " city.");
		System.out.println("Student gender is: " + sp.getGender());
		System.out.println("Student is studying in: " + sp.getSchoolName() + " school");
		System.out.println("Student rollNo: " + sp.getRollNo());
		
		scan.close();
		
	}
}

public class StudentPojoClass 
{

	public static void main(String[] args) 
	{
		StudentPojoImplementation spi=new StudentPojoImplementation();
		spi.studentPojoImplementation();

	}

}
