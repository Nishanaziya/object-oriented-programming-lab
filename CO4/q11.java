import java.util.LinkedList;
import java.util.scanner;

class Linkedlist{

    private LinkedList<Integers> linkedlist;

    public Linkedlist(){
        linkedlist = new LinkedList<Integers>();
    }

    public boolean isEmpty(){
        return(linkedlist.size()==0)? true: false;
    }

    public void addElementToFront(int element){
        linkedlist.addFirst(element);
    }

    public void addElementToLast(int element){
        linkedlist.addLast(element);
    }

    public void display(){
        for(int i :linkedlist){
            System.out.printf("%d\t",i);
        }
    }

}
class q11 {
  public static void main(String args[]) {

    Scanner sc =new Scanner(System.in);

    LinkedList linkedlist = new LinkedList();

    int c;

    do{

           System.out.print("\nEnter choice\n");

           switch(c){
            case 1 : {

                SYstem.out.print("enter number");
                int n =sc.nextInt();
                linkedlist.addElementToFront(n);

            }

            break;

            case 2 : {
                try{
                    System.out.print("linkedlist elements are: ");
                    linkedlist.display();
                }

                catch (RuntimeException e){
                    System.out.println(e.getMessage());
                }
            }
           }
    }while(c!=0);


  }

}

