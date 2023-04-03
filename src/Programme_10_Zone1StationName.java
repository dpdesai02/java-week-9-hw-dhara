/*
Write a programme that tells you which line passes through particular stations.
 Just use Zone 1 stations name.

 */

import java.util.HashMap;

import java.util.Scanner;

public class Programme_10_Zone1StationName {

    public static void main(String[] args) {
        main();
    }

    public static void main() {

        char result;
        System.out.println("London Underground Zone1 Stations:");

        HashMap<String, String> zone = new HashMap<>();
        zone.put("Jubilee Line","Baker Street,Bond Street,Green Park,London Bridge,Southwark,waterloo,Westminster");
        zone.put("Metropolitan Line" ,"Bond Street ,Green Park,London Bridge,Southwark,Waterloo,Westminster");
        zone.put("Bakerloo Line", "Bond Street ,Green Park,London Bridge,Southwark,Waterloo,Westminster");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any station name");
            String stationName = scanner.nextLine();

            for (String str : zone.keySet()) {
                if (stationName.equals(str)) {
                    System.out.println("Tube Lines:" + zone.get(str));
                }
            }
            System.out.println(" ");
            System.out.println("Do You want to try again:'Y' or 'N' :");
            result = scanner.next().charAt(0);

        }
        while (result == 'Y' || result == 'Y');

    }
}




