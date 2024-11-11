package Week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee
{
	private int id;
	private String name,department;

	public Employee(int id, String name, String department) 
	{
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public int getId()
	{
		return id;
	}
	public String getName() 
	{
		return name;
	}
	public String getDepartment() 
	{
		return department;
	}
	public String toString()
	{
		return "Employee ID : "+id + " , Name : "+name +", Department : " +department;
	}
}

public class EmployeeManager
{
	private HashMap<Integer,Employee>employeeMap; 
	
	public EmployeeManager()
	{
		employeeMap=new HashMap<>();
	}
	public void addEmployee(int id ,String name,String department)
	{
		Employee emp=new Employee(id,name,department);
		employeeMap.put(id, emp);
		System.out.println("Employee Added : "+name);
	}
	
	public void getEmployee(int id)
	{
		if(employeeMap.containsKey(id))
		{
		Employee emp = employeeMap.get(id);
		System.out.println(emp);
		} else
		{
			System.out.println("Employee with ID : "+id + "not found");
		}
	}
	public void displayAllEmployees()
	{
		if(employeeMap.isEmpty())
		{
			System.out.println("No Employee found ");
		}
		else
		{
			System.out.println("Employee Lists :");
			for(Map.Entry<Integer, Employee> entry : employeeMap.entrySet())
			{
				System.out.println(entry.getValue());
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		EmployeeManager mng=new EmployeeManager();
		
		while(true)
		{
			System.out.println("\n1. Add Employee ");
			System.out.println("2. Get Employee details By ID ");
			System.out.println("3. Display All Employees ");
			System.out.println("4. Exit.. ");
			System.out.println(" Enter your Choice");
			
			int  choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Employee ID ");
				int id=sc.nextInt();
				System.out.println("Enter Employee Name ");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("Enter Department :");
				String department=sc.next			();
				mng.addEmployee(id, name,department);
				break;
			case 2 :
				System.out.println("Enter Employee ID to retrieve: ");
				int searchID=sc.nextInt();
				mng.getEmployee(searchID);
				break;
			case 3 :
				mng.displayAllEmployees();
				break;
			case 4 :
				System.out.println("Exiting.....");
				break;
				default :
					System.out.println("Invalid choice! Please try again ");
			}

		}

	}

}
