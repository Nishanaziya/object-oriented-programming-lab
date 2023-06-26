import java.util.*;
public class q11 {

	public static void main(String[] args) {
		LinkedList<String> L = new LinkedList<>();
		L.add("Apple");
		L.add("Orange");
		L.add("Grapes");
		L.add("Blueberries");
		L.add("Avocado");
		L.add(0,"Pineapple");
		System.out.println(L);
		L.remove(1);
		System.out.println(L);
		L.remove("Grapes");
		System.out.println(L);
		L.removeFirst();
		System.out.println(L);
		L.removeLast();
		System.out.println(L);
	}
}