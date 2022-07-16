package collSamo;

import java.util.ArrayList;

public class LisrtExam {
    public static void main(String[] args) {
        ArrayList<String> dfs = new ArrayList<>();
        ArrayList<String> as = new ArrayList<>();

        dfs.add("Harsha");
        dfs.add("Sindhu");
        dfs.add("Deepak");
        dfs.add("Chandana");
        dfs.add("Bharath");
        System.out.println(dfs);
        dfs.add(3,"Rahul");
        System.out.println(dfs);
        dfs.set(1,"manju");
        dfs.remove("Rahul");
        dfs.remove(2);

        System.out.println(dfs.get(3));
        System.out.println(dfs);


        as.add("Mango");
        as.add("Banana");
        as.add("sasd");
        as.add("Masdsango");

        dfs.addAll(as);
        dfs.clear();
        System.out.println(dfs);
    }
}
