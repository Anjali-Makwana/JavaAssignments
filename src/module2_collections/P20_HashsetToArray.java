package module2_collections;

import java.util.HashSet;

public class P20_HashsetToArray {
    public static void main(String[] args) {

    	HashSet<String> hSet = new HashSet<>();
        hSet.add("Red");
        hSet.add("Green");
        hSet.add("Black");
        hSet.add("White");
        hSet.add("Pink");
        hSet.add("Yellow");

        System.out.println("Original Hash Set: " + hSet);

        // Create an array of the same size as the hash set
        String[] newArray = new String[hSet.size()];
        hSet.toArray(newArray);

        System.out.println("Array elements:");
        for (String element : newArray) {
            System.out.println(element);
        }
    }
}
