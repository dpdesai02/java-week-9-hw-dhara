import java.util.ArrayList;

/*
Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.*/
public class Programme_4_NewArraylist {

    public static void main(String[] args) {
        //Create an ArrayList which is going to
        //contain a list of colours
        ArrayList<String> colours = new ArrayList<String>();

        //Add Colours to the list
        colours.add("Violet");
        colours.add("Indigo");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Yellow");
        colours.add("Orange");
        colours.add("Red");

        //print colours of the rainbow
        System.out.println("Rainbow Colours: ");

        //forEach method of ArrayList and print the colour names
        colours.forEach((col) -> print(col));
    }

    //printing rainbow colours
    public static void print(String col){
        System.out.println("This is a Rainbow Colour: "+col);
    }

}

