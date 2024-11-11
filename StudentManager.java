package Week4;

import java.util.ArrayList;
import java.util.Scanner;

class Student
{
	private String name;
	private int roll;
	
	public Student(String name, int roll) 
	{
		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	 
	public String toString()
	{
		return "Student Name : "+name+" Roll Number :"+roll;
	}
	
}

public class StudentManager 
{
	private ArrayList<Student> studentList;
	
	

	public StudentManager()
	{
		this.studentList = new ArrayList<>();
	}
	
	public void addStudent(String name,int roll)
	{
		Student newStudent = new Student(name, roll);
		studentList.add(newStudent);
		System.out.println("Student added : "+name);
	}
	
	public void removeStudent(int roll)
	{
		boolean found= false;
		for(Student student :studentList)
		{
			if(student.getRoll()==roll)
			{
				studentList.remove(student);
				System.out.println("Student removed : "+ student.getName());
				found =true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Student with roll number : "+ roll + " not found ");
		}
	}

	public void displayStudents()
	{
		if(studentList.isEmpty())
		{
			System.out.println("No student found");
		}else
		{
		System.out.println("List of the students");
		for(Student student :studentList)
		{
			System.out.println(student);
		}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		StudentManager mng= new StudentManager();
		
		while (true)
		{
			System.out.println("\n1.  Add new Student ");
			System.out.println("2.    Remove a Student");
			System.out.println("3.    Display Student");
			System.out.println("4.    Exit");
			System.out.println("      Enter your Choice");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Student name : ");
				sc.nextLine();
				String name =sc.nextLine();
				System.out.println("Enter roll number : ");
				int roll=sc.nextInt();
				mng.addStudent(name, roll);
				break;
				
			case 2:
				System.out.println("Enter roll number to remove");
				int rollToRemove =sc.nextInt();
				mng.removeStudent(rollToRemove);
				break;
				
			case 3:
				mng.displayStudents();
				break;
			case 4: 
				System.out.println("Existing......");
				return;
			default :
				System.out.println("Invalid choice ! Please try again.");
			}


		}
	}

}
