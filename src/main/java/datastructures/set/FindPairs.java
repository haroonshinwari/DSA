package datastructures.set;

import java.util.*;

public class FindPairs {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]

        */

    }

    public static  List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> arr1Set = new HashSet<>();
        List<int[]> result = new ArrayList<>();

        for (int n : arr1) {
            arr1Set.add(n);
        }

        for (int n: arr2) {
            if (arr1Set.contains(target-n)) {
                int[] pair = {target-n, n};
                result.add(pair);
            }
        }
        return result;
    }
}
