package hash;

// source: https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/

import java.util.ArrayList;

public class Hashtable<K, V> {
    private ArrayList<HashNode<K, V>> hashArray;

    class HashNode<K, V> {
        K key;
        V value;

        HashNode<K, V> next;

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

    // add: takes in both the key and value.
    // This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
    public V add(K key, V value) {
        int bucketIndex = getIndex(key);
        HashNode<K, V> node = hashArray.get(bucketIndex);

        // check if key is already in array
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return node.value;
            }
            node = node.next;
        }

        node = hashArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
        System.out.println(newNode.key);
        System.out.println(newNode.value);
        newNode.next = node;
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

    // contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
    public boolean contains(K key) {
        int index = getIndex(key);
        HashNode<K, V> node = hashArray.get(index);

        while (node != null) {
            if (node.key.equals(key)) return true;
            node = node.next;
        }
        return false;
    }

    // hash: takes in an arbitrary key and returns an index in the collection.
    public int hash(K key) {
        return getIndex(key);
    }
}
