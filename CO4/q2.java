import arithmetic.*;
import java.util.Scanner;

class q2 {

  public static void main(String args[]) {

    int choice;
    Scanner scanner = new Scanner(System.in);

    System.out.print("enter two numbers for arithmetic operations : ");
          double num1 = scanner.nextDouble();
          double num2 = scanner.nextDouble();


    System.out.print("0) exit\n1) addition\n2) subtraction\n3) multiplication\n4) division\n\n");
    do {
      System.out.print("enter a choice : ");
      choice = scanner.nextInt();

      switch (choice) {
        case 0: {
          System.out.println("exiting...");
          break;
        }
        case 1: {

          Addition addition = new Addition();
          System.out.printf("\nsum : %.2f\n", addition.add(num1, num2));
          break;
        }
        case 2: {

          Subtraction subtraction = new Subtraction();
          System.out.printf("\ndifference : %.2f\n", subtraction.sub(num1, num2));
          break;
        }
        case 3: {

          Multiplication multiplication = new Multiplication();
          System.out.printf("\nproduct : %.2f\n", multiplication.mul(num1, num2));
          break;
        }
        case 4: {

          Division division = new Division();
          System.out.printf("\nquotient : %.2f\n", division.div(num1, num2));
          break;
        }
        default: {
          System.out.println("wrong choice!");
        }
      }
    } while (choice != 0);
    scanner.close();
  }
}