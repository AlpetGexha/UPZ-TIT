package Kollofjumi_2;


import java.util.LinkedList;

public class Stack_linkedList {

    LinkedList<Integer> list;

    public Stack_linkedList() {
        list = new LinkedList<>();
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
