import graphics.*;
import java.util.Scanner;


class q1{

  public static void main(String args[]){
    
    int c;
    Scanner scanner = new Scanner(System.in);

    System.out.printf("0) exit\n1) area of circle\n2) area of triangle\n3) area of square\n4) area of rectangle\n\n");
    do {
      System.out.print("Enter a choice : ");
      c = scanner.nextInt();

      switch(c){

        case 0: {
          System.out.println("exiting...");
          break;
 
        }
        case 1: {
          System.out.print("enter the radius of the circle : ");
          double radius = scanner.nextDouble();

          Circle circle = new Circle(radius);
          System.out.printf("\narea fo the circle : %.2f\n\n",circle.area()); 
          break;

        }
        case 2: {
          System.out.print("enter the base , height of the triangle : ");
          double base = scanner.nextDouble();
          double height = scanner.nextDouble();
        

          Triangle triangle = new Triangle(base,height);

          System.out.printf("\narea of the triangle : %.2f\n\n",triangle.area());
          break;

        }
        case 3: {
          System.out.print("enter the side of the square : ");
          double side = scanner.nextDouble();

          Square square = new Square(side);

          System.out.printf("area of the square : %.2f\n\n",square.area());
          break;

        }
        case 4 : {
          System.out.print("enter the length and breadth of the rectangle : ");
          double length = scanner.nextDouble();
          double breadth = scanner.nextDouble();

          Rectangle rectangle = new Rectangle(length , breadth);

          System.out.printf("\narea of the rectangle : %.2f\n\n",rectangle.area());
          break;
        }
        default : {
          System.out.println("Wrong choice!");
          break;
        }
   }

    }while( c != 0 );

  }
}