package data.structures.linkedlist;

import java.util.ArrayList;

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

    public ArrayList<Integer> print() {

        ArrayList<Integer> valuesArr = new ArrayList<>();

        for (Node itr = head; itr != null; itr = itr.next) {
            valuesArr.add(itr.value);
        }
        return valuesArr;
    }

    public void append(int val) {

        Node node = new Node(val);
        node.next = null;

        // if list is empty append as head
        if (this.head == null) {
            this.head = node;
        }
        else {
         // if list not empty loop to end and append new node
            Node itr = this.head;
            while (itr.next != null) {
                itr = itr.next;
            }
            itr.next = node;
        }
    }
}
