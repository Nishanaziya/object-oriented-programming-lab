import java.util.*;

class PrintFirstNFibonacciNumbers implements Runnable{
    int number;

    public PrintFirstNFibonacciNumbers(int number){
        this.number = number;
    }

public void run(){
    int num1 = 0 , num2 = 1, num3 , count = 2;

    System.out.printf("%d\n%d\n",num1,num2);

    while(count < number){
        num3 = num1+num2;
        System.out.printf("%d\n",num3);
        num1 = num2;
        num2 = num3;
        count++;
    }
}
}

class PrintEvenNumbers implements Runnable{
    int start, end;

    public PrintEvenNumbers(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void run(){
        if(start % 2!=0) 
        start++;

    for(int i = start; i <= end; i+=2) System.out.printf("%d\n",i);    
  }
}

class q6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("how many numbers of fibonacci series: ");
        int number = sc.nextInt();

        System.out.print("enter a starting number and an ending number :");
        int start = sc.nextInt();
        int end = sc.nextInt();

        Runnable fibonacci = new PrintFirstNFibonacciNumbers(number);
        Runnable even = new PrintEvenNumbers(start,end);

        Thread thread1 = new Thread(fibonacci);
        Thread thread2 = new Thread(even);

        thread1.start();
        thread2.start();
    }
}