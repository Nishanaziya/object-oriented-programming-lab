package q4;

import java.util.Scanner;

class rowcol
{
	int r,c;
}

public class symmm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		rowcol obj1 = new rowcol();
		
		System.out.println("Enter the row and col");
		
		obj1.r = sc.nextInt();
		obj1.c = sc.nextInt();
		
		System.out.println("enter the matrix elements");
		
		int a [][] = new int[obj1.r][obj1.c];
		for(int i = 0;i<obj1.r;i++) {
			for(int j = 0;j<obj1.c;j++) {
				a [i][j]= sc.nextInt();
			}
		}
		
		System.out.println("transpose");
		
		for(int i = 0; i<obj1.r;i++) {
			for(int j=0; j<obj1.c;j++) {
				System.out.printf(a[j][i]+" ");
			}System.out.println();
		}
		
		if(obj1.r==obj1.c) {
			
			boolean symmetric=true;
			
			for(int i=0;i<obj1.r;i++) {
				for(int j=0;j<obj1.c;j++) {
					if(a[i][j]!=a[j][i]) {
						symmetric = false;
						break;
					}
				}
			}
			
			if(symmetric) {
				System.out.println("Symmetric matrix");
			}
			
			else {
				System.out.println("Not Symmetric");
			}
		}
		
			

	}

}
