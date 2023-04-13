package co3;

import java.util.Scanner;

class Person{
	String Name,Gender,Address;
	int Age;

	Person(String Name,String Gender, String Address,int Age){
		this.Name= Name;
		this.Gender=Gender;
		this.Address=Address;
		this.Age=Age;
	}
}

class Emp extends Person{
	int Empid,Salary;
	String Company_name,Qualification;
	
	Emp(String Name,String Gender, String Address,int Age,int Empid,int Salary,String Company_name,String Qualification){
		
		super(Name,Gender,Address,Age);
		this.Empid=Empid;
		this.Salary=Salary;
		this.Company_name=Company_name;
		this.Qualification=Qualification;
	}
}
class Teach extends Emp{
	String Subject,Department;
	int Teacherid;
	
	Teach(String Name,String Address, String Gender,int Age,int Empid,String Company_name,String Qualification,int Salary,String Subject,String Department,int Teacherid){
	
	super(Name,Gender,Address,Age,Empid,Salary,Company_name,Qualification);
	this.Subject=Subject;
	this.Department=Department;
	this.Teacherid=Teacherid;
	}
	
	void display() {
		System.out.printf("\nDetails of teacher\n\nName : %s\nAddress : %s\nGender : %s\nAge : %d\nEmployee Id : %d\nInstitution Name : %s\nQualification : %s\nSalary : %d\nSubject : %s\nDepartment : %s\nTeacher Id : %d\n\n\n",this.Name,this.Address,this.Gender,this.Age,this.Empid,this.Company_name,this.Qualification,this.Salary,this.Subject,this.Department,this.Teacherid);
	}
}
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of teacher's details to be entered");
		n=sc.nextInt();
		Teach[]obj=new Teach[n];
		
		for(i=0;i<n;i++) {
			System.out.printf("\nTeacher %d details\n",i+1);
			System.out.println("Name : ");
			String Name=sc.next();
			System.out.println("Address : ");
			String Address=sc.next();
			System.out.println("Gender : ");
			String Gender=sc.next();
			System.out.println("Age : ");
			int Age=sc.nextInt();
			System.out.println("Emploment Id : ");
			int Empid=sc.nextInt();
			System.out.println("Institution Name : ");
			String Company_name=sc.next();
			System.out.println("Qualification : ");
			String Qualification=sc.next();
			System.out.println("Salary : ");
			int Salary=sc.nextInt();
			System.out.println("Subject : ");
			String Subject=sc.next();
			System.out.println("Department : ");
			String Department=sc.next();
			System.out.println("Teacher Id : ");
			int Teacher_id=sc.nextInt();
			
			obj[i]=new Teach(Name,Address,Gender,Age,Empid,Company_name,Qualification,Salary,Subject,Department,Teacher_id);
			
		}
		for(i=0;i<n;i++) {
			obj[i].display();
		}

	}

}
