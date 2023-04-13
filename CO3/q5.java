package co3;

import java.util.Scanner;

class Student{
	String Name;
	int roll_no;
	Student(String Name,int roll_no){
		this.Name = Name;
		this.roll_no = roll_no;
	}
}

class Sport extends Student{
	
	int spscore;
	Sport(String Name,int roll_no, int spscore){
	super(Name,roll_no);
	this.spscore=spscore;
	}	
}

class result extends Sport{
	int acscore;
	result(String Name,int roll_no, int spscore, int acscore){
		super(Name,roll_no,spscore);
		this.acscore=acscore;
		
	}
	
	void display() {
		System.out.printf("Student name : %s\nRoll no. : %d\nSports score : %d\nAcademics score : %d\n\n",this.Name,this.roll_no,this.spscore,this.acscore);
	}
}
public class q5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter name : ");
		String name= sc.next();
		System.out.println("Enter roll no. : ");
		int roll= sc.nextInt();
		System.out.println("Academic score : ");
		int ac= sc.nextInt();
		System.out.println("Sports score : ");
		int spc= sc.nextInt();
		
		result obj = new result(name,roll,ac,spc);
		System.out.println("Student detail");
		obj.display();


	}

}
