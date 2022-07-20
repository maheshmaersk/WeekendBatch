package collSamo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HarhsMao {
    public static void main(String[] args) {
//        HashSet<String> fruits = new HashSet<>();
//        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Chikku");

        System.out.println(fruits.size());

        System.out.println(fruits);


        Iterator<String> it = fruits.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
