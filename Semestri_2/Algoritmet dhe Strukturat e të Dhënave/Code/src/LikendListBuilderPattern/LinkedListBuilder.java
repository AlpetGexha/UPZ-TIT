package LikendListBuilderPattern;

import Java_5_LinkedList.LinkedList2;

public class LinkedListBuilder {
    private final LinkedList2 list = new LinkedList2();

    public LinkedListBuilder add(Object element) {
        list.add(element);
        return this;
    }

    public LinkedListBuilder addAt(Object element, int index) {
        list.addAt(element, index);
        return this;
    }

    public LinkedListBuilder addLast(Object element) {
        list.addLast(element);
        return this;
    }

    public LinkedListBuilder addFirst(Object element) {
        list.addFirst(element);
        return this;
    }

    public LinkedList2 build() {
        return list;
    }

    public void display() {
        list.display();
    }
}

