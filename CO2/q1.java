package co2;

import java.util.*;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of strings to be sorted");
		int n = sc.nextInt();
		
		String array[] = new String[n];
		System.out.printf("Enter %d string to sort: ",n);
		
		for(int i=0;i<n;i++) {
			array[i] = sc.next();
		}
		
		System.out.println("Before sorting:\n");
		for(int i=0;i<n;i++) {
			System.out.printf("%s\t", array[i]);
		
		}
		
		Arrays.sort(array);
		
		System.out.println("\n after sorting");
		for(int i=0;i<n;i++) {
			System.out.printf("%s\t",array[i]);
		}

	}

}
