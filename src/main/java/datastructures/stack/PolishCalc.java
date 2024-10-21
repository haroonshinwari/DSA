package datastructures.stack;

public class PolishCalc {

    public static void main(String[] args) {

        String[] tokens = {"2","1","+","3","*"};
        String[] token2 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println(evalRPN(tokens));
        System.out.println(evalRPN(token2));

        System.out.println(6/-132);
    }

    public static int evalRPN(String[] tokens) {

        int a,b;
        Stack<Integer> S = new Stack<>();
        for (String s : tokens) {
            if(s.equals("+")) {
                S.push(S.pop()+S.pop());
            }
            else if(s.equals("/")) {
                b = S.pop();
                a = S.pop();
                S.push(a / b);
            }
            else if(s.equals("*")) {
                S.push(S.pop() * S.pop());
            }
            else if(s.equals("-")) {
                b = S.pop();
                a = S.pop();
                S.push(a - b);
            }
            else {
                S.push(Integer.parseInt(s));
            }
        }
        return S.pop();
    }
}
