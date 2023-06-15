import Java.util.LinkedList;

class q11{
    public static void main (String args[]){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Nisha");
        ll.add("anu");

        System.out.print("before removing: "+ll);

        ll.clear();
        System.out.println("removing:"+ll);
    }
}