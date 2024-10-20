package main.java.datastructures.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */
    }

    private static Character firstNonRepeatingChar(String word) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c: word.toCharArray()) {
            if (map.get(c) == null) {
                map.put(c, 1);
            }else {
                map.put(c,map.get(c) + 1);
            }
        }

        for (char c: word.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return null;
    }


}
