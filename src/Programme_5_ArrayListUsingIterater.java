
/*
Write a Java program to iterate through all elements in an array list using
Iterater.

*/


import java.util.ArrayList;

public class Programme_5_ArrayListUsingIterater { public static void main(String[] args) {

    // declaration of ArrayList
    ArrayList<Integer> empID = new ArrayList<>();

    //Adding employee ID in arrayList
    empID.add(101);
    empID.add(102);
    empID.add(103);
    empID.add(104);
    empID.add(105);
    empID.add(106);

    //Iterate all element using iterator
    for(Integer id :empID){
        System.out.println(id);
    }
}
}
