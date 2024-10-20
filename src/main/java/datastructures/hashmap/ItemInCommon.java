package main.java.datastructures.hashmap;

import java.util.HashMap;

public class ItemInCommon {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));

        /*
            EXPECTED OUTPUT:
            ----------------
            true

        */
    }

    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i : array1) {
            map.put(i, true);
        }

        for (int i : array2) {
            if (map.get(i) != null) {
                return true;
            }
        }
        return false;
    }
}
