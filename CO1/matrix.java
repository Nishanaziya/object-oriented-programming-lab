package q2;
import java.util.Scanner;

class rc
{
	int r,c;
}

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		rc obj1 = new rc();
		
		System.out.println("enter row and col");
		obj1.r = sc.nextInt();
		obj1.c = sc.nextInt();
		
		
		
		System.out.println("enter the elements of matrix 1");
		int[][]a = new int[obj1.r][obj1.c];
		for(int i=0;i<obj1.r;i++) {
			for(int j=0;j<obj1.c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("enter the elements of matrix 2");
		int[][]b = new int[obj1.r][obj1.c];
		for(int i=0;i<obj1.r;i++) {
			for(int j=0;j<obj1.c;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		
		int [][] c= new int [obj1.r][obj1.c];
		for(int i=0;i<obj1.r;i++) {
			for(int j=0;j<obj1.c;j++) {
				c[i][j]= a[i][j]+b[i][j];
			}
		}
		
		
		System.out.println("maytrix addition");
		
		for(int i=0;i<obj1.r;i++) {
			for(int j=0;j<obj1.c;j++) {
				System.out.print(c[i][j]+ " ");
			}System.out.println();
		}
		
		
		

	}

}
