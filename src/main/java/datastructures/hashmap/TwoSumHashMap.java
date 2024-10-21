package datastructures.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []

        */

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] emptyArray = new int[0];
        int[] twoSums = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        if (nums.length == 0) {
            return emptyArray;
        }else {
            for (int i=0; i < nums.length; i++) {
                if (map.get(nums[i]) == null) {
                    map.put(target - nums[i], i);
                } else {
                    twoSums[0] = map.get(nums[i]);
                    twoSums[1] = i;
                    return twoSums;
                }
            }

        }
        return emptyArray;
    }

}
