package datastructures.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LCE771JewelsAndStones {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
        //Expected Output: 3

        System.out.println(numJewelsInStones("z","ZZ"));
        //Expected Output: 0
    }

    public static int numJewelsInStonesUsingHashMap(String jewels, String stones) {
        int jewelsFound = 0;

        Map<Character, Boolean> map = new HashMap<>();
        for (Character c : jewels.toCharArray()) {
            map.put(c, true);
        }

        for (Character s : stones.toCharArray()) {
            if(map.get(s) != null) {
                jewelsFound++;
            }
        }
        return jewelsFound;
    }

    public static int numJewelsInStones(String jewels, String stones) {

        Set<Character> jewelSet = new HashSet<>();
        for (Character c : jewels.toCharArray()) {
            jewelSet.add(c);
        }

        int jewelsFound = 0;
        for (Character s : stones.toCharArray()) {
            if(jewelSet.contains(s)) {
                jewelsFound++;
            }
        }
        return jewelsFound;
    }

}
