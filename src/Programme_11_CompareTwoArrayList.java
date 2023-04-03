/*
11. Declare following two arrylist and compare it.

ArrayList<String> c1= new ArrayList<String>();
c1.add("Red");
c1.add("Green");
c1.add("Black");
c1.add("White");
c1.add("Pink");
ArrayList<String> c2= new ArrayList<String>();
c2.add("Red");
c2.add("Green");
c2.add("Black");
c2.add("Pink");
 */


import java.util.ArrayList;

public class Programme_11_CompareTwoArrayList {

    public static void main(String[] args) {

        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Display both ArrayList
        System.out.println(" ArrayList1 = " + c1);
        System.out.println(" ArrayList = " + c2);

        // compare c1 with c2
        if (c1.equals(c2) == true) {
            System.out.println(" Array List are equal");
        }
        else
        // else block execute when
        // ArrayList are not equal
        {
            System.out.println(" Array List are not equal");
        }

        // insert one more item in c2
        System.out.println(" Lets insert one more item in Array List");
        c2.add("item 5");

        // display both ArrayList
        System.out.println(" ArrayList1 = " + c1);
        System.out.println(" ArrayList = " + c2);

        // again compare c1 with c2
        if (c1.equals(c2) == true) {
            System.out.println(" Array List are equal");
        }
        else {
            System.out.println(" Array List are not equal");
        }
    }
}


