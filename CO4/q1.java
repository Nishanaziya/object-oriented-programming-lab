import graphics.*;
import java.util.*;

class q1{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        Square sqr = new Square();
        Circle cir = new Circle();
        int c;
        do{
            System.out.println("Enter the choice\n1. Area of Rectangle\n2. Area of Triangle\n3. Area of Square\n4. Area of Circle\n0. Exit");
            c = sc.nextInt();
            switch(c){
                case 1: rect.rectangle();
                break;
                case 2: tri.triangle();
                break;
                case 3: sqr.square();
                break;
                case 4: cir.circle();
                break;
                case 0: System.out.println("Exiting...!!!");
                break;
            }
        }while(c!=0);
    }
}