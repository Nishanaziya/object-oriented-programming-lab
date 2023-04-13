package co3;

import java.util.Scanner;

interface Prototype{
	double area();
	double perimeter();
}

class Circle implements Prototype{
	double radius;
	Circle(double radius){
		this.radius= radius;
	}
	
	public double area() {
		return(3.14*this.radius*this.radius);
	}
	public double perimeter() {
		return(2*3.14*this.radius);
	}
}

class Rectangle implements Prototype{
	double l,b;
	Rectangle(double l,double b){
		this.l= l;
		this.b= b;
	}
	
	public double area() {
		return(this.l*this.b);
	}
	public double perimeter() {
		return(2*(this.l*this.b));
	}
}
public class q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c;
		do {
			System.out.println("\nEnter your choice\n0 exit\n1 Area & Perimeter of circle\n2 Area & Perimeter of rectangle\n  ");
			c =sc.nextInt();
			
			switch(c) {
			case 0:{
				System.out.println("exiting.....");
				break;
			}
			
			case 1:{
				System.out.println("Enter the radius :");
				double radius =sc.nextDouble();
				Circle obj =new Circle(radius);
				System.out.printf("Area of circle : %f\nPerimeter of circle : %f",obj.area(),obj.perimeter());
				break;
			}
			
			case 2:{
				System.out.println("Enter the length and breadth :");
				double l =sc.nextDouble();
				double b =sc.nextDouble();
				Rectangle obj1 =new Rectangle(l,b);
				System.out.printf("Area of rectangle : %f\nPerimeter of rectangle : %f",obj1.area(),obj1.perimeter());
				break;
			}
			
			default : {
		          System.out.println("Invalid choice!");
		        }
			}
		}while(c!=0);

	}

}
