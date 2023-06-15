
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

class q18{
    public static void main(String args[]){

        HashMap <Integer,String> obj = new HashMap<>();
        obj.put(1,"ammu");
        obj.put(2,"appu");

        System.out.print("Elements are:"+obj);

        TreeMap <Integer,String> obj1 = new TreeMap<>(obj);
        System.out.println("tree map is"+ obj1);



    }
}