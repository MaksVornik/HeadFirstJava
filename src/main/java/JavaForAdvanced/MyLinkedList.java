package JavaForAdvanced;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyLinkedList {
    private int size;

    private Node head;

    public void add(int value) {
        // if this is the  first addition to the list
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public String toString() {
        int[] result = new int[size];
        int idx = 0;
        Node temp = head;
        while (temp != null) {
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }
    public int get(int index){
        int currentIndex = 0;
        Node temp = head;
        while (temp != null) {
            if (currentIndex == index) {
                return  temp.getValue();
            }
            else {
                temp = temp.getNext();
                currentIndex++;
            }

        }
        throw new IllegalArgumentException();
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
