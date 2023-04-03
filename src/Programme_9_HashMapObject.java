
/*
Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Programme_9_HashMapObject {


    public static void main(String[] args) {

        Map<String,Integer> people = new HashMap<>();

        people.put("Sandy",11);
        people.put("Lucy",22);
        people.put("Andy",33);
        people.put("Judy",44);
        people.put("Rose",55);

        // getKey() and getValue() methods to print names and associated numbers
        for
        (Map.Entry<String, Integer > names: people.entrySet())

        {

            System.out.println(names.getKey()+", "+names.getValue());
        }

    }
}
