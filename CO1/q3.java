package q3;
 
import java.util.Scanner;


class complex
{
	int r,i;
}

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		complex obj1 = new complex();
		complex obj2 = new complex();
		
		
		System.out.println("enter r1");
		obj1.r= sc.nextInt();
		
		System.out.println("enter i1");
		obj1.i = sc.nextInt();
		
		System.out.println("enter r2");
		obj2.r = sc.nextInt();
		
		System.out.println("enter i2");
		obj2.i = sc.nextInt();
		
		System.out.printf("First complex %d + %di",obj1.r,obj1.i);
		System.out.println();
		System.out.printf("Second complex %d + %di",obj2.r,obj2.i);
		System.out.println();
		
		System.out.println("ADDITION");
		int r1 = obj1.r + obj2.r;
		int i1 = obj1.i + obj2.i;
		
		System.out.printf("%d + %di",r1,i1);
		
		
		
		

}
}