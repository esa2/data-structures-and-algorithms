package hash;

// source: https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/

import java.util.ArrayList;

public class Hashtable<K, V> {
    private ArrayList<HashNode<K, V>> hashArray;

    class HashNode<K, V> {
        K key;
        V value;

        // Reference to next node
        HashNode<K, V> next;

        // Constructor
        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public Hashtable() {
        hashArray = new ArrayList<>();
        int hashArraySize = 1024;

        // create empty buckets in array
        for (int i = 0; i < hashArraySize; i++) hashArray.add(null);
    }

    // hash using key to find index
    public int getIndex(K key) {
        int temp = 0;
        int index;

        for (int i = 0; i < key.toString().length(); i++) {
            temp += (int) key.toString().charAt(i);
        }

        temp *= 599;
        index = temp % 1024;
        System.out.println("index: " + index);
        return index;
    }

    public V add(K key, V value) {
        int bucketIndex = getIndex(key);
        HashNode<K, V> head = hashArray.get(bucketIndex);

        // check if key is already in array
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return head.value;
            }
            head = head.next;
        }

        head = hashArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
        System.out.println(newNode.key);
        System.out.println(newNode.value);
        newNode.next = head;
        hashArray.set(bucketIndex, newNode);
        return newNode.value;
    }

    // get: takes in the key and returns the value from the table.
    public V get(K key) {
        int index = getIndex(key);
        HashNode<K, V> head = hashArray.get(index);

        while (head != null) {
            if (head.key.equals(key)) return head.value;
            head = head.next;
        }
        return null;
    }
}
