package exceptionsAndCollection;

import java.util.Scanner;

class InvalidDepositAmountException extends Exception
{
	public InvalidDepositAmountException(String message)
	{
		super(message);
	}
}

class InvalidWithdrawAmountException extends Exception
{
	public InvalidWithdrawAmountException(String message)
	{
		super(message);
	}
}

class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String message)
	{
		super(message);
	}
}

class Bank
{
	private String name;
	private int age;
	private String city;
	private String bankName;
	private double balance;
	
	public Bank(String name,int age,String city,String bankName,double initialBalance)
	{
		this.name=name;
		this.age=age;
		this.city=city;
		this.bankName=bankName;
		
		balance= initialBalance;
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
	
	public String getBankName()
	{
		return bankName;
	}
	
	public void deposit(double amount) throws InvalidDepositAmountException
	{
		if(amount<=0)
		{
			throw new InvalidDepositAmountException("The deposit amount should be greater than 0");
		}
		else
			balance=balance+amount;
	}
	
	public void withdrawAmount(double withdraw) throws InsufficientBalanceException, InvalidWithdrawAmountException
	{
		if(withdraw<=0)
		{
			throw new InvalidWithdrawAmountException("The withdrawl amount should be greater than 0");
		}
		else if(withdraw>balance)
		{
			throw new InsufficientBalanceException("Withdrawl amount must be greater than balance");
		}
		else
			balance=balance-withdraw;
	}
	
	public double getBalance()
	{
		return balance;
	}

}

class UserInput
{
	
	public void userInput()
	{
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Enter the name:");
		String name=scan.next();
		
		System.out.println("Enter the age:");
		int age=scan.nextInt();
		
		System.out.println("Enter the city");
		String city=scan.next();
		
		System.out.println("Enter the bank name:");
		String bankName=scan.next();
		
		System.out.println("User details:");
		System.out.println("*************");
		System.out.println("Name " + name);
		System.out.println("Age: " + age);
		System.out.println("City: " + city);
		System.out.println("Bank name: " + bankName);
		
		System.out.println("*************");
		
		System.out.println();
		
		System.out.print("Enter initial balance: ");
		double initialBalance = scan.nextDouble();
		
		Bank account = new Bank(name,age,city,bankName,initialBalance);
 

		System.out.print("Enter deposit amount: ");
		double depositAmount = scan.nextDouble();
		
		try 
		{
			account.deposit(depositAmount);
			System.out.println("Deposit successful. Current balance: " + account.getBalance());
		}
		catch (InvalidDepositAmountException e) 
		{
			System.out.println("Invalid deposit: " + e.getMessage());
		}

		System.out.print("Enter withdrawal amount: ");
		double withdraw = scan.nextDouble();
		
		try
		{
			account.withdrawAmount(withdraw);
			System.out.println("Withdrawal successful. Current balance: " + account.getBalance());
		}
		catch (InsufficientBalanceException | InvalidWithdrawAmountException e)
		{
			System.out.println("Withdrawal failed: " + e.getMessage());
		}
     
		scan.close();
	}

     
}

public class BankingSystem 
{

	public static void main(String[] args) 
	{
		UserInput ui=new UserInput();
		ui.userInput();

	}

}