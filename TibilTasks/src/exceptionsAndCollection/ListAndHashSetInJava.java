package exceptionsAndCollection;

import java.util.*;

//POJO class
class ListAndHashSet
{
	private String name;
	private int age;
	private String city;
	private String companyName;
	private int empId;
	
	public ListAndHashSet(String name, int age, String city, String companyName, int empId)
	{
		this.name=name;
		this.age=age;
		this.city=city;
		this.companyName=companyName;
		this.empId=empId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getCompanyName()
	{
		return companyName;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
}

class ImplementationClassList
{
	public void implementationClassList()
	{
		ArrayList<ListAndHashSet> al=new ArrayList<ListAndHashSet>();
		
		Scanner scan=new Scanner(System.in);
		int totalItems=0;
		boolean flag=false;
		
		System.out.println("Please enter the no. of items you wnat to add inside the list:");
		
		while(!flag)
		{
			try
			{
				totalItems=scan.nextInt();
				flag=true;
			}
			catch(InputMismatchException e)
			{
				System.out.println();
				scan.next();
			}
		}
		
		for(int i=0;i<totalItems;i++)
		{
			System.out.println("Enter the name:");
			String name=scan.next();
			
			System.out.println("Enter the age:");
			int age=scan.nextInt();
			
			System.out.println("Enter the city:");
			String city=scan.next();
			
			System.out.println("Enter your company name:");
			String company=scan.next();
			
			System.out.println("Enter your employee id:");
			int employeeId=scan.nextInt();
			
			al.add(new ListAndHashSet(name, age, city, company, employeeId));
		}
		
		Iterator<ListAndHashSet> itr=al.iterator();
		
		System.out.println("This is where we access the list:");
		while(itr.hasNext())
		{
			ListAndHashSet obj=itr.next();
			System.out.println("Name: " + obj.getName());
			System.out.println("Age: " + obj.getAge());
			System.out.println("City: " + obj.getCity());
			System.out.println("Company name: " + obj.getCompanyName());
			System.out.println("Employee id: " + obj.getEmpId());
			
			System.out.println("************************");
			
			System.out.println();
		}
		
		
	}
}


class ImplementationClassHashSet
{
	public void implementationClassHashSet()
	{
		HashSet<ListAndHashSet> hs=new HashSet<ListAndHashSet>();
		
		Scanner scan=new Scanner(System.in);
		
		int totalHashItems=0;
		boolean flag=false;
		
		System.out.println("Please enter the number of elements yo wnat to add in hashSet: ");
		
		while(!flag)
		{
			try
			{
				totalHashItems=scan.nextInt();
				flag=true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Exception has been handled");
				scan.next();
			}
		}
		
		for(int i=0;i<totalHashItems;i++)
		{
			System.out.println("Enter the name: ");
			String name=scan.next();
			
			System.out.println("Enter the age:");
			int age=scan.nextInt();
			
			System.out.println("Enter the city:");
			String city=scan.next();
			
			System.out.println("Enter your company name:");
			String company=scan.next();
			
			System.out.println("Enter your employee id:");
			int employeeId=scan.nextInt();
			
			hs.add(new ListAndHashSet(name,age,city,company,employeeId));
		}
		
		Iterator<ListAndHashSet> it=hs.iterator();
		
		System.out.println("Access the data in hashset:");
		
		while(it.hasNext())
		{
			ListAndHashSet o=it.next();
			
			System.out.println(o.getName());
			System.out.println("Age: " + o.getAge());
			System.out.println("City: " + o.getCity());
			System.out.println("Company name: " + o.getCompanyName());
			System.out.println("Employee id: " + o.getEmpId());
			
			System.out.println("************************");
			
			System.out.println();
		}
		
	}
}

public class ListAndHashSetInJava 
{

	public static void main(String[] args) 

	{
		ImplementationClassList ic=new ImplementationClassList();
		ic.implementationClassList();
		
		ImplementationClassHashSet ich=new ImplementationClassHashSet();
		
		ich.implementationClassHashSet();
		
		
	}

}
