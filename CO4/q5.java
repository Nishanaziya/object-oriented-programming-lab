import java.util.*;
import java.lang.Math;

class PrintMultiplicationTableOffive extends Thread{
    int number;

    public PrintMultiplicationTableOffive(int number){
        this.number = number;
    }

    public void run(){
        for(int i=1; i <=number; i++){
            System.out.printf("%d x %d = %d\n",i,5,i*5);
            try{
                Thread.sleep(2);
            }

            catch(InterruptedException e){System.out.println("Interrupted exception");}
        }
    }
}

class PrintFirstPrimeNumbers extends Thread {
    int number;
    public PrintFirstPrimeNumbers(int number){
        this.number = number;
    }

    public void run(){

        int count = 0, num = 2;
        while(count < this.number){
            boolean IsPrime = true;

        for(int i=2; i<(int)(Math.sqrt(num)+1);i++){
            if(num % i ==0){
                IsPrime = false;
                break;
            }
        }

        if(IsPrime){
            System.out.printf("%d\n",num);
            count+=1;
        }

        num += 1;

        try{
            Thread.sleep(2);
        }
        catch(InterruptedException e){
            System.out.println("Interrupted exception");
        }
        }

    }
}

    class q5{
        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);

            System.out.print("enter the number of table entries of five : ");
            int NoOfTableEntries =sc.nextInt();

            System.out.print("enter the number of prime numbers : ");
            int NoOfPrimeNumbers = sc.nextInt();

            PrintMultiplicationTableOffive multiplication = new PrintMultiplicationTableOffive(NoOfTableEntries);
            PrintFirstPrimeNumbers prime = new PrintFirstPrimeNumbers(NoOfPrimeNumbers);

            multiplication.start();
            prime.start();
        }
    }
