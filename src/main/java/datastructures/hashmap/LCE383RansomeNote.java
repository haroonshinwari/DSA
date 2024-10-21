package datastructures.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LCE383RansomeNote {

    public static void main(String[] args) {
        System.out.println(canConstruct("a","b")); //Expected Output: false
        System.out.println(canConstruct("aa","ab")); //Expected Output: false
        System.out.println(canConstruct("aa","aab")); //Expected Output: true
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();
        for(Character c : magazine.toCharArray()) {
            if(map.get(c) != null ) {
                map.put(c, map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }

        for(Character c : ransomNote.toCharArray()) {
            if(map.get(c) != null && map.get(c) != 0) {
                map.put(c, map.get(c)-1);
            }else {
                return false;
            }
        }
        return true;
    }
}
