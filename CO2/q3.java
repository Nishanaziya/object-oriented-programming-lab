package co2;

import java.util.Scanner;

class function{
	Scanner sc = new Scanner(System.in);
	
	void upper() {
		System.out.println("Enter the string");
		String str =sc.next();
		System.out.printf("\n%s",str.toUpperCase());
	}
	
	void lower() {
		System.out.println("Enter the string");
		String str =sc.next();
		System.out.printf("\n%s",str.toLowerCase());
	}
	
	void length() {
		System.out.println("enter the string");
		String str =sc.next();
		System.out.printf("length: %d", str.length());
		
	}
	void concate()
	{
		System.out.println("Enter the 2 strings");
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.printf("%s",String.join(" ",str1,str2));
	}
	
	void substring() {
		System.out.println("Enter the string to find the substring");
		String str = sc.next();
		System.out.println("enter the first index");
		int ind1 = sc.nextInt();
		System.out.println("enter the second index");
		int ind2 = sc.nextInt();
		System.out.printf("Substring of entered string: %s",str.substring(ind1,ind2));
		
	}
	
	void replace() {
		System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println("Enter the word to be replaced: ");
        String l1 = sc.next();
        System.out.println("Enter the word to replace: ");
        String l2 = sc.next();
        System.out.println("String replaced at the first occurrence only: "+str.replaceFirst(l1,l2));
        System.out.println("String replaced with every occurrence: "+str.replaceAll(l1,l2));
	}
	void split(){
        System.out.println("Enter the string to be split:");
        String str = sc.next();
        String[] arrStr = str.split(" ");
        System.out.println("Array:");
        for(String x : arrStr){
            System.out.println(x);
        }
        System.out.println();
    }
}



public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    function func = new function();
        int c;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\nEnter the choice:");
            System.out.println("1. Convert to Upper Case \n2. Convert to lower Case\n3. Find the length of the string\n4 String concatenation\n5. Find the substring of a string\n6. Replace the string\n7. Split the string\n0. Exit");
            c = sc.nextInt();
            switch(c){
                case 1: func.upper();
                        break;
                case 2: func.lower();
                        break;
                case 3: func.length();
                        break;
                case 4: func.concate();
                        break;
                case 5: func.substring();
                        break;
                case 6: func.replace();
                        break;
                case 7: func.split();
                        break;
                case 0: System.out.println("Exiting....!!");
                        break;
                default: System.out.println("Invalid Choice!!");
                        break;
            }
        }while(c!=0);
		
		
	}
}