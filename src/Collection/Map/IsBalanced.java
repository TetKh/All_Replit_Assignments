package Collection.Map;

import java.util.*;

public class IsBalanced {

    public static void main(String[] args) {

        //TESTS
        System.out.println(isBalanced("()")); //- true
        System.out.println(isBalanced("((()))")); //- true
        System.out.println(isBalanced("([[{{}}]])")); //- true
        System.out.println(isBalanced("()(){}{{}}[][[]]")); //- true
        System.out.println(isBalanced("[{()}]")); // - true
        System.out.println(isBalanced("({}{}([{}]))"));// - true
        System.out.println(isBalanced("[({(})]")); // false
        System.out.println(isBalanced("{[}"));//- false
        System.out.println(isBalanced("({")); //- false

    }


    public static boolean isBalanced(String str) {

        Stack<String> stack = new Stack<>();
        for (String s : str.split("")) {

            if (!stack.isEmpty() && (s.matches("[),},\\]]")) && (stack.peek().matches("[(,{\\[]"))) {
                stack.pop();
            } else { stack.push(s);
            }
        }
        return stack.isEmpty();
    }
}
/*
Queue<String> queue = new LinkedList<>();
        for (String s : str.split("")) {
            if (!queue.isEmpty() && (s.matches("[),},\\]]")) && (queue.peek().matches("[(,{\\[]"))) {
                queue.poll();
            } else {
                queue.offer(s);
            }
        }
        return queue.isEmpty();
    }
}
 */
