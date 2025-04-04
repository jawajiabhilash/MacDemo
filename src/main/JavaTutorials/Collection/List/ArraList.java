package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArraList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("A"));
        System.out.println(arrayList.indexOf("B"));
        System.out.println(arrayList.isEmpty());
        arrayList.clear();
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList);
        System.out.println("-------------------------------------------------");
        System.out.println("Stack");
        System.out.println("-------------------------------------------------");
        System.out.println("Stack is a subclass of Vector that implements a standard last-in, first-out stack.");
        System.out.println("Stack only defines the default constructor, which creates an empty stack.");
        System.out.println("Stack includes all the methods defined by Vector, and adds several of its own.");
        System.out.println("Stack is a subclass of Vector that implements a standard last-in, first-out stack.");
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.contains("A"));
        System.out.println(stack.indexOf("B"));
        System.out.println(stack.isEmpty());
        stack.clear();
        System.out.println(stack.isEmpty());
        System.out.println(stack);
        System.out.println("-------------------------------------------------");
        System.out.println("Stack");

    }
}
