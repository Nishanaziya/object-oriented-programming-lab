package co3;

import java.util.Scanner;

class Employee{
	int Empid, Salary;
	String Name, Address;
	
	Employee(int Empid, String Name, int Salary, String Address){
		this.Empid = Empid;
		this.Name = Name;
		this.Salary = Salary;
		this.Address = Address;
		
	}
}

class Teacher extends Employee{
	
	String Department, Subject;
	
	Teacher(int Empid, String Name, int Salary, String Address, String Department, String Subject){
		
		super(Empid, Name, Salary, Address);
		this.Department = Department;
		this.Subject = Subject;
	}
	
	void display() {
		System.out.printf("Employee Id : %d\nName : %s\nSalary : %d\nAddress : %s\nDepartment : %s\nSubject : %s\n\n\n\n\n\n",this.Empid,this.Name,this.Salary,this.Address,this.Department,this.Subject);
	}
	
}



public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of teacher's details to be entered");
		int n = sc.nextInt();
		Teacher[] obj1 = new Teacher[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Teacher " + (i+1)+" Details: ");
			System.out.println("Enter Id");
			int Empid = sc.nextInt();
			System.out.println("Enter Name");
			String Name = sc.next();
			System.out.println("Enter Salary");
			int Salary = sc.nextInt();
			System.out.println("Enter Address");
			String Address = sc.next();
			System.out.println("Enter Department");
			String Department = sc.next();
			System.out.println("Enter Subject");
			String Subject = sc.next();
			
			obj1[i] = new Teacher(Empid, Name, Salary, Address, Department, Subject);
				
			
		}
		
		System.out.println("Employee Information");
		for(int i=0;i<n;i++) {
			obj1[i].display();
		}
		
		
	}

}
