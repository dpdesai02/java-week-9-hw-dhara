
/*
Write a Java program to test if anarray list  is empty or not.
 */

import java.util.ArrayList;

public class Programme_7_ArrayList

{ public static void main(String[] args) {


    ArrayList<String> s = new ArrayList<>();

    s.add("I am Peaceful soul");
    s.add("I am Energetic");
    s.add("Life is Beautiful");

    boolean a = true;
    // this if condition will be true if arraylist is empty
    if (!(a != s.isEmpty())) {
        System.out.println("is array list empty");
    } else {
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }
}
}


