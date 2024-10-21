package datastructures.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LCE242ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram")); //Expected Output: True
        System.out.println(isAnagram("rat","car")); //Expected Output: False
        System.out.println(isAnagram("eminem","menime")); //Expected Output: True

        System.out.println(isAnagramUsingTwoHashMaps("anagram","nagaram")); //Expected Output: True
        System.out.println(isAnagramUsingTwoHashMaps("rat","car")); //Expected Output: False
        System.out.println(isAnagramUsingTwoHashMaps("eminem","menime")); //Expected Output: True
    }

    public static boolean isAnagramUsingTwoHashMaps(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (Character c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for (Character c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        return sMap.equals(tMap);
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if(map.get(c)!= null) {
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c, 1);
            }
        }


        for (Character c : t.toCharArray()) {
            if (map.get(c) != null && map.get(c) != 0) {
                map.put(c, map.get(c)-1);
            }else {
                return false;
            }
        }
        return true;
    }
}
