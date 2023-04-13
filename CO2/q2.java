package co2;

import java.util.*;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,data,i;
		
		boolean found = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of elements in the array: ");
		n= sc.nextInt();
		int a []=new int[n];
		
		
		System.out.println("Enter the  elements of the array: ");
		
		for( i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the data to be searched: ");
		data=sc.nextInt();
		for ( i=0;i<n;i++) {
			if(a[i]== data) {
			found = true;
			break;
			}
			
		}
		if(!found)System.out.printf("%d not present in array\n",data);
		else System.out.printf("element %d found at %d",data,i+1);
	}

}
