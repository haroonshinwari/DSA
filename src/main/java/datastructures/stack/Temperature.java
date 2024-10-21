package datastructures.stack;

import java.util.Arrays;

public class Temperature {

    public static void main(String[] args) {

        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] t1 = {30,40,50,60};
        int[] t2 = {30,60,90};
//        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
//        System.out.println(Arrays.toString(dailyTemperatures(t1)));
//        System.out.println(Arrays.toString(dailyTemperatures(t2)));

        int[] t = {89,62,70,58,47,47,46,76,100,70};
        System.out.println(Arrays.toString(dailyTemperaturesSimple(temperatures)));

    }

    public static int[] dailyTemperaturesSimple(int[] temperatures) {
        Stack<Integer> helperStack = new Stack<>();

        int n = temperatures.length;
        int[] result = new int[n];

        for (int index = n-1; index >=0; index--) {
            //Popping all indices with a lower or equal temperature than the current index
            while (!helperStack.isEmpty() && temperatures[index] >= temperatures[helperStack.peek()]) {
                helperStack.pop();
            }

            //If the helperStack still has elements, then the next warmer temperature exists
            if (!helperStack.isEmpty()) {
                result[index] = helperStack.peek() - index;
            }

            //Inserting current index in stack
            helperStack.push(index);
        }
        return result;
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] days = new int[temperatures.length];

        for (int i=0 ; i<temperatures.length -1; i++) {
            int number = 1;
            int pointer = i+1;

            while (pointer < temperatures.length  && temperatures[i] >= temperatures[pointer]) {
                number++;
                pointer++;
                if(pointer == temperatures.length) {
                    number = 0;
                }
            }
            days[i] = number;
        }
        return days;
    }
}
