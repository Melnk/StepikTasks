package org.example.level1;

public class Linked {
    Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        return prev;
    }

    interface Node{
        Node getNext();

        void setNext(Node next);
    }

}
