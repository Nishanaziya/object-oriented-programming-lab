package co3;

import java.util.Scanner;

class Publisher{
	
	String p_name;
	
	Publisher(String p_name){
		this.p_name=p_name;
	}
}

class Book extends Publisher{
	
	String author;
	int no_of_pages,price;
	
	Book(String p_name,String author,int no_of_pages,int price){
		
		super(p_name);
		this.author= author;
		this.no_of_pages= no_of_pages;
		this.price=price;
	}
	
}

class literature extends Book{
	String l_name;
	
	literature(String p_name,String author,int no_of_pages,int price,String l_name){
		super(p_name,author,no_of_pages,price);
		this.l_name=l_name;
	}
	
	void display() {
		System.out.printf("\nName of Book : %s\nGenere : Literature\nAuthir : %s\nPublisher: %s\nNumber of Pages :%d\nPages :%d\n\n",this.l_name,this.author,this.p_name,this.no_of_pages,this.price);
	}
}

class fiction extends Book{
	String f_name;
	fiction(String p_name,String author,int no_of_pages,int price,String f_name){
		super(p_name,author,no_of_pages,price);
		this.f_name=f_name;
	}
	
	void display() {
		System.out.printf("\nName of Book : %s\nGenere : Fiction\nAuthir : %s\nPublisher: %s\nNumber of Pages :%d\nPages :%d\n\n",this.f_name,this.author,this.p_name,this.no_of_pages,this.price);
	}
	
}
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int c;
		
		do {
			System.out.println("Enter a choice:\n0 exit\n1 Literature Book\n2 Fiction Book\n");
			c= sc.nextInt();
			
			switch(c) {
			case 0:{
				System.out.println("Exiting/......");
				break;
				
			}
			
			case 1:{
				System.out.println("Enter book title");
				String title=sc.next();
				System.out.println("Enter Author name");
				String author=sc.next();
				System.out.println("Enter Publisher name");
				String publisher=sc.next();
				System.out.println("price");
				int price=sc.nextInt();
				System.out.println("page number");
				int page_no=sc.nextInt();
				
				literature obj1= new literature(publisher,author,page_no,price,title);
				
				System.out.println("Literature book detailS");
				obj1.display();
				break;
			}
			
			case 2:{
				System.out.println("Enter book title");
				String title=sc.next();
				System.out.println("Enter Author name");
				String author=sc.next();
				System.out.println("Enter Publisher name");
				String publisher=sc.next();
				System.out.println("price");
				int price=sc.nextInt();
				System.out.println("page number");
				int page_no=sc.nextInt();
				
				fiction obj2= new fiction(publisher,author,page_no,price,title);
				
				System.out.println("Literature book detailS");
				obj2.display();
				break;
			}
			
			default:{
				System.out.println("Invalid choice");
			}
			}
		}while(c!=0);

	}

}
