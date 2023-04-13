package co2;
import java.util.Scanner;

class Employee{
  int eNo , eSalary;
  String eName;

  void setInfo(int eNo, String eName, int eSalary){
    this.eNo = eNo;
    this.eName = eName;
    this.eSalary = eSalary;
  }

  void display(){
    System.out.println("Employee information");
    System.out.printf("employee number : %d\n",this.eNo);
    System.out.printf("employee name : %s\n",this.eName);
    System.out.printf("employee salary : %d\n",this.eSalary);
  }
}

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	    System.out.print("How many employees : ");
	    int number = scanner.nextInt();

	    Employee[] emp = new Employee[number];

	    for(int i = 0; i < number; i++){
	      System.out.printf("Enter the employee number , name , and salary of employee %d\n",i+1);
	      int no = scanner.nextInt();
	      String name = scanner.next();
	      int salary = scanner.nextInt();
	      emp[i] = new Employee();
	      emp[i].setInfo(no,name,salary);
	    }

	    System.out.println("Enter an eployee number to search for : ");
	    int search = scanner.nextInt();
	    boolean found = false;

	    for(int i = 0; i < number; i++){
	      if(emp[i].eNo == search){
	        found = true;
	        emp[i].display();
	        break;
	      }
	    }

	    if(!found)
	      System.out.println("Employee not found!");

	 

	}

}
