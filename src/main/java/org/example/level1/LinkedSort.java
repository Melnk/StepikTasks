package org.example.level1;

public class LinkedSort {
    Node merge(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        // Находим конец первого списка
        Node inter = head1;
        while (inter.getNext() != null) {
            inter = inter.getNext();
        }
        // Соединяем два списка
        inter.setNext(head2);

        // Сортируем объединенный список
        boolean swapped;
        do {
            swapped = false;
            Node prev = null;
            Node current = head1;
            Node next = head1.getNext();

            while (next != null) {
                if (current.getData() > next.getData()) {
                    // Меняем местами current и next
                    if (prev != null) {
                        prev.setNext(next);
                    } else {
                        head1 = next;
                    }
                    current.setNext(next.getNext());
                    next.setNext(current);

                    swapped = true;
                }
                prev = current;
                current = next;
                next = next.getNext();
            }
        } while (swapped);

        return head1;
    }

    class Node {
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
