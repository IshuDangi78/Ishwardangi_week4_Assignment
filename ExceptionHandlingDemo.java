package Week4;

import java.util.Scanner;

//Custom Exception for Invalid Inputs

class InvalidInputException extends Exception
{
	public InvalidInputException(String message)
	{
		super (message);
	}
}

public class ExceptionHandlingDemo 
{
	public static void performDivision(int a,int b) throws InvalidInputException
	{
		if(b==0)
		{
			throw new ArithmeticException("Division by zero is not allowed ");
		}
		if(a>1000)
		{
			throw new InvalidInputException(" The nuemerator is too large");
		}
		int c=a/b;
		System.out.println("The result of the division is : "+c);
	}

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the Numerator");
			int num1=sc.nextInt();
			System.out.println("Enter the Denumerator");
			int num2=sc.nextInt();
			performDivision(num1,num2);
			
		}catch(ArithmeticException e)
		{
			System.out.println("Error : "+ e.getMessage());
		}
		catch(InvalidInputException e)
		{
			System.out.println("Error : "+ e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("A unknown Error occured : "+ e.getMessage());
		}
		
		try
		{
			String name = "Ishwar";
			System.out.println("Length of name : "+ name.length());
			
		}catch(NullPointerException e)
		{
			System.out.println("Error : try to access something that doesn't exist.");
			
		}
		try
		{
			System.out.println("Performing another Operation...");
			int result=10/0;
			String text=null;
			System.out.println(text.length());	
		}catch(ArithmeticException | NullPointerException e)
		{
			System.out.println("Multiple Exception caught  "+e.getMessage());
		}
		System.out.println("Program completed. ");
	}

}
