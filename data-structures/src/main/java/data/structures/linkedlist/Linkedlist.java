package data.structures.linkedlist;

public class Linkedlist {
    Node head;

    public void insert(int val) {

        Node node = new Node(val);

        if (this.head == null) {
            this.head = node;
            node.next = null;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    public boolean includes(int val) {

            for (Node itr = head; itr != null; itr = itr.next) {
            if (itr.value == val) return true;
        }
        return false;
    }
}
