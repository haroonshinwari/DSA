package datastructures.stack;

public class SortedStack {

    // WRITE THE SORTSTACK METHOD HERE //
    public static void sortStack(Stack originalStack) {

        Stack<Integer> sortedStack = new Stack<>();
        while(!originalStack.isEmpty()) {
            int temp = Integer.parseInt(originalStack.pop().toString());

            while(!sortedStack.isEmpty() && sortedStack.peek() > temp) {
                originalStack.push(sortedStack.pop());
            }
            sortedStack.push(temp);
        }
        while (!sortedStack.isEmpty()) {
            originalStack.push(sortedStack.pop());
        }
    }



    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */

    }

}

