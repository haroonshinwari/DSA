package main.java.datastructures.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicatesList = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : nums) {
            if(map.get(i) != null && !duplicatesList.contains(i)) {
                duplicatesList.add(i);
            }else {
                map.put(i,true);
            }
        }
        return duplicatesList;
    }
}
