package datastructures.set;

import javax.xml.stream.events.Characters;
import java.util.HashSet;
import java.util.Set;

public class HasUniqueCharacters {

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false

        */

    }

    public static boolean hasUniqueChars(String s) {
        Set<Character> result = new HashSet<>();

        for(char c: s.toCharArray()) {
            if(!result.add(c)) {
                return false;
            }
        }
        return true;
    }
}
