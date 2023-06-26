import java.util.*;
public class q16 {

	public static void main(String[] args) {

        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("Orange");
        h_set.add("Pink");

        HashSet<String>h_set2 = new HashSet<String>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Black");
        h_set2.add("Orange");

        for (String element : h_set){
            System.out.println(h_set2.contains(element) ? "Yes" : "No");
        }

	}

}