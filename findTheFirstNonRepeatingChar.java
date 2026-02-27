import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // finding the first non repeating character in a string 
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        sc.close();
        System.out.println(x instanceof String);
        if (x == null || x.isEmpty() || x.isBlank()) {
            System.out.println("Invalid input");
            return;
        }
        //using hasmap
        HashMap < Character, Integer > map = new LinkedHashMap < > ();

        //function to put values in map
        map = addingValues(map, x);
        System.out.println("Map:" + map);

        //function to find the nonrepeating character

        char result = findChar(map);

        if (result == '\u0000') {
            System.out.println("No non-repeating character found");
        } else {
            System.out.println("First non repeating character is: " + result);
        }


    }
    public static HashMap < Character, Integer > addingValues(HashMap < Character, Integer > map, String x) {
        for (int i = 0; i < x.length(); i++) {
            map.put(x.charAt(i), map.getOrDefault(x.charAt(i), 0) + 1);
        }
        return map;
    }
    public static char findChar(HashMap < Character, Integer > map) {
        for (Map.Entry < Character, Integer > entry: map.entrySet()) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }
        return '\u0000';
    }
}