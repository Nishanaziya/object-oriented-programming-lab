import java.util.*;

class NegativeNumberException extends Exception {

    NegativeNumberException(String message){
        super(message);
    }
}

class q4{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n, number, sum =0;
        double average;

        System.out.print("how many numbers: ");
        n = sc.nextInt();

        for(int i =0; i<n; i++){

            try{
                System.out.printf("enter number %d :",i+1);
                number = sc.nextInt();

            if(number<0)
            throw new NegativeNumberException("Negative numbers are not allowed");

            sum+= number;
            }

            catch(NegativeNumberException e){
                System.out.println(e.getMessage());
                i--;
            }
        }

        average = (double) sum / n;

        System.out.printf("average : %.2f\n",average );
        
    }
}