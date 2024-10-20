package main.java.datastructures.hashmap;

import java.sql.Array;
import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }


    public static List<List<String>> groupAnagrams(String[] stringsArray) {
        Map<String,List<String>> anagramGroups = new HashMap<>();

        for (String s : stringsArray) {

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String canonical = chars.toString();

            if (anagramGroups.get(canonical) != null) {
                List<String> group = anagramGroups.get(canonical);
                group.add(s);
                anagramGroups.put(canonical, group);
            } else {
                List<String> group = new ArrayList<>();
                group.add(s);
                anagramGroups.put(canonical, group);
            }
        }
        List<List<String>> result = anagramGroups.values().stream().toList();
        return result;
    }
}
