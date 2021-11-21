package Collection.Map;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class ReverseUsingStack {

    public static void main(String[] args) {

        printReverse(new String[]{"Bahar", "Oyat", "tatiana", "Kurush", "Firdavs"});

    }

    public static void printReverse(String[] name) {

        Stack<String> stack = new Stack<>();

            for (int i = 0; i < name.length; i++) {
                String ch = name[i];
                stack.push(ch);
            }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");

        }

    }
}
/*
public static void printReverse(String[] names){
 Stack <String> str=new Stack<>();
 for(String str1:names){
   str.push(str1);
 }
Iterator<String> iter = str.iterator();
while (iter.hasNext()){
  System.out.println(str.pop());
}
  }
 */