import java.io.*;
import java.util.*;
class stack<T>{
	ArrayList<T> A;
	int top=-1;
	int size;
	stack(int size){
		this.size=size;
		this.A = new ArrayList<T>(size);
	}
	void push (T X) {
		if(top+1==size) {
			System.out.println("Stack overflow!!!");
		}
		else {
			top=top+1;
			A.add(X);
		}
	}
	void pop() {
		if(top==-1) {
			System.out.println("Stack underflow!!1");
		}
		
		else {
			System.out.println("Stack after pop operation");
			top--;
		}}
	void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(A.get(i) +" ");
		}
	      System.out.println();
	}}
class q8 {
public static void main(String[] args) {
// TODO Auto-generated method stub	
       stack<Integer> obj = new stack<>(3);
       obj.push(10);
       obj.push(20);
       obj.push(30);
      obj.display();
       obj.pop();
       obj.display();
}}
