import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        //given two strings checking if one is an valid anagram of other
        String x = "listen";
        String y = "silent";



        if (((x == null) || (y == null)) || (x.isBlank() || y.isBlank()) || (x.isEmpty() || y.isEmpty())) {
            System.out.println("Invalid input for anagram check");
            return;
        }
        //check the lengths of both strings are equal
        if (x.length() != y.length()) {
            System.out.println("Different lengths of string for anagram check");
            return;
        }

        //since the length of both string is equal use one loop for hashmap insertion
        //order not require - so use hashmap
        HashMap < Character, Integer > map = new HashMap < > ();
        //call addvalue
        System.out.println("map:" + addValue(map, x, y));


        //call checkAnagram function
        boolean result = checkAnagram(map);
        if (result) {
            System.out.println("The given strings are valid anagram");
        } else {
            System.out.println("The given strings are not anagram");
        }

        //using int[26] approach
        int[] count = new int[26];
        for (int i = 0; i < x.length(); i++) {
            count[x.charAt(i) - 'a']++;
            count[y.charAt(i) - 'a']--;
        }
        for (int val: count) {
            if (val != 0) return false;
        }
        return true;


    }
    public static HashMap < Character, Integer > addValue(HashMap < Character, Integer > map, String x, String y) {
        for (int i = 0; i < x.length(); i++) {
            map.put(x.charAt(i), map.getOrDefault(x.charAt(i), 0) + 1);
            map.put(y.charAt(i), map.getOrDefault(y.charAt(i), 0) - 1);
        }
        return map;
    }

    public static boolean checkAnagram(HashMap < Character, Integer > map) {
        for (int value: map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}