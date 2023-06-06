package Kollofjumi_2;


import java.util.LinkedList;

public class Stack_linkedList {

    LinkedList<Integer> list;

    public Stack_linkedList() {
        list = new LinkedList<>();
    }

    public static void main(String[] args) {
//        TESTING
        Stack_linkedList stack = new Stack_linkedList();
        stack.push(1); // x
        stack.push(2); // x
        stack.push(3); // x
        stack.peek(); // 3
        stack.pop(); // 3
        stack.peek(); // 2
        stack.pop(); // 2
        stack.peek(); // 1
        stack.pop(); // 1
        stack.peek(); // empty
        stack.pop(); // empty
    }

    public void push(int x) {
        list.addFirst(x);
    }

    public void pop() {
        if (list.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Pop: " + list.removeFirst());

    }

    public void peek() {
        if (list.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Peek: " + list.getFirst());
    }

}
