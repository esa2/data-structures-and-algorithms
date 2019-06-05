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

    public void insertBefore(int val, int newVal) {

       Node newNode = new Node(newVal);
       Node itr = this.head;
       Node itrPrev = null;

       // Throw exception if empty linked list
       if (itr == null) {
           System.out.println("The insert before value " + val + " was not found because the linked list is empty");
           throw new IllegalArgumentException();
       }
       while (itr.value != val) {
           itrPrev = itr;
           itr = itr.next;
           // Throw exception if at end of link list
           if (itr == null) {
               System.out.println("The insert before value " + val + " was not found in the linked list");
               throw new IllegalArgumentException();
           }
       }
       if (itrPrev != null) {
           itrPrev.next = newNode;
       } else {
           this.head = newNode;
       }
       newNode.next = itr;
    }

    public void insertAfter(int val, int newVal) {

        // Throw exception if empty linked list
        if (this.head == null) {
            System.out.println("The insert after value " + val + " was not found because the linked list is empty");
            throw new IllegalArgumentException();
        }

        Node newNode = new Node(newVal);
        Node itr = this.head;

        while (itr.value != val) {
            itr = itr.next;
            // Throw exception if at end of link list
            if (itr == null) {
                System.out.println("The insert after value " + val + " was not found in the linked list");
                throw new IllegalArgumentException();
            }
        }
        Node NextNode = itr.next;
        itr.next = newNode;
        itr.next.next = NextNode;
    }

    public int kthFromEnd(int k) {

        if (k < 0) {
            System.out.println("The argument " + k + " is a negative number which is not a valid argument");
            throw new IllegalArgumentException();
        }

        int counter = 0;
        Node target = null;
        for (Node itr = this.head; itr != null; itr = itr.next) {

            if (counter == k) target = this.head;
            if (counter > k) target = target.next;
            counter++;
        }

        // Throw exception if loop didn't get to or past head node
       if (target == null) {
           System.out.println("The argument " + k + " is too large. The link only has " + counter + " nodes");
           throw new IllegalArgumentException();
       }
       return target.value;
    }
}
