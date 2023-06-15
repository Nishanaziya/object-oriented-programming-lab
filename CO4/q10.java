import java.util.*;

class q10{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
    int c,n;
    Scanner sc = new Scanner(System.in);

    do {
        System.out.print("\nEnter Choice\n1. Add\n2. Remove\n3. Replace\n4. print list\n");
        c =sc.nextInt();

        switch(c)
        {
            case 1:
                System.out.print("Enter number to insert: ");
                n = sc.nextInt();
                list.add(n);
                break;

            case 2:
                System.out.print("\nEnter number to be removed: ");
                n =  sc.nextInt();
                list.remove(n);
                System.out.println(list);
                break;

            case 3:
                System.out.print("\nIndex to be replaced: ");
                int key = sc.nextInt();
                System.out.print("\nENter the value to be inserted");
                n= sc.nextInt();
                list.set(key,n);
                System.out.print(list);
                break;

            case 4:
                System.out.print(list);

        }
    }while(c!=0);
}
}