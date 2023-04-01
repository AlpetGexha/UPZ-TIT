package LikendListBuilderPattern;

import Java_5_LinkedList.LinkedList2;

public class LinkedListBuilder {
        private LinkedList2 list = new LinkedList2();

        public LinkedListBuilder add(Object element) {
            list.add(element);
            return this;
        }

        public LinkedListBuilder addAt(Object element, int index) {
            list.addAt(element, index);
            return this;
        }

        public LinkedList2 build() {
            return list;
        }

        public void display() {
            list.display();
        }
    }

