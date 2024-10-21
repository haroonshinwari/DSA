package datastructures.hashmap;

import java.util.HashSet;
import java.util.Set;

public class LCE217ContainsDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
        //Expected Output: True
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
