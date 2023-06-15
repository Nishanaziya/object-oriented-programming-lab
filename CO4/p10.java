import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


class p10{
public static void main(String args[]){

    Scanner sc = new Scanner (System.in);

    ArrayList<String> strings =new  ArrayList<String>();

    System.out.print("Enter the number of string");

    int n = sc.nextInt();

    System.out.printf("enter %d strings", n);

    for (int i=0;i<n;i++){
        String input = sc.next();
        strings.add(input);
    }

int c;

do{
    System.out.print("\nchoice:\n1 print\n2 upper\n3 lower\n4 reverse\nsort \n");
    c= sc.nextInt();

    switch(c){
        case 1 : {
            for (int i = 0;i<n;i++){
                System.out.printf("%s\t",strings.get(i));
            }
        }
        break;

        case 2 : {
            for(int i=0;i<n;i++){
                strings.set(i,strings.get(i).toUpperCase());
            }
        }

        break;

        case 3 : {
            for(int i=0; i<n; i++){
                strings.set(i,strings.get(i).toLowerCase());
            }
        }

        break;

        case 4 :{
            for(int i =0; i<n;i++){
                StringBuilder reversed = new StringBuilder(strings.get(i)).reverse();
                strings.set(i,reversed.toString());

            }
        }

        break;
        case 5 :{
            Collections.sort(strings);
        }

        break;
    }
}while(c!=0);

}

 }