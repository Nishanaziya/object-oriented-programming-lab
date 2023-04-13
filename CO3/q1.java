package co3;

import java.util.*;

class shape{
	double area(double r) {
		return(3.14*r*r);
		}
	double area(double b,double h) {
		return(0.5*b*h);
	}
	int area(int l,int w) {
		return(l*w);
	}
	int area(int s) {
		return(s*s);
	}
	
	
}

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		shape obj = new shape();
		int c;
		
		do {
			System.out.print("Enter your choice\n1.Area of circle\n2.Area of rectangle\n3.Arae of triangle\n4.Area of square\n0.Exit\n ");
			c = sc.nextInt();
			switch(c) {
			case 1: {
				System.out.println("Enter the radius: ");
				double r = sc.nextDouble();
				double area = obj.area(r);
				System.out.printf("The area of the circle is %f\n",area);
				break;	
			}
			
			case 2:{
				System.out.println("enter base and height: ");
				double b = sc.nextDouble();
				double h = sc.nextDouble();
				double area = obj.area(b,h);
				System.out.printf("The area of traingle is %f\n",area);
				break;
			}
			
			case 3:{
				System.out.println("enter length and breadth of rectangle: ");
				int l = sc.nextInt();
				int w = sc.nextInt();
				int area = obj.area(l,w);
				System.out.printf("The area of rectangle is %d\n", area);
				break;
				
			}
			case 4:{
				System.out.println("Enter the side of the square: ");
				int s = sc.nextInt();
				int area = obj.area(s);
				System.out.printf("The area of square is %d\n",area);
				break;
				
			}
			case 0:{
				System.out.println("EXITING....");
				break;
			}
			
			default :{
				System.out.println("wrong choice");
			}
			
			}
		}while(c!=0);

	}

}
