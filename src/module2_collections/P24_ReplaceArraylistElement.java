package module2_collections;

import java.util.ArrayList;

public class P24_ReplaceArraylistElement {
	
    public static void main(String[] args) {
    	
        ArrayList<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");

        System.out.println("Original array list: " + color);

        String newColor = "White";
        color.set(1, newColor);

        System.out.println("Replace second element with 'White':");
        for (String c : color) {
            System.out.println(c);
        }
    }
}

