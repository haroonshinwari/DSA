package datastructures.stack;

public class ReversedString {

    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }

    public static String reverseString(String s) {
        if (s == null) {
            return null;
        }else {
            Stack<Character> stack = new Stack<>();
            String reversedString = "";
            for(Character c: s.toCharArray()) {
                stack.push(c);
            }
            while(!stack.isEmpty()) {
                reversedString = reversedString + stack.pop();
            }
            return reversedString;
        }
    }

}

