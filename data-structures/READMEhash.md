# Lab: Hash Table Implementation

Implement a Hashtable without using any of Java's built in classes 
***

## Challenge

Implement a Hashtable with the following methods:

add:
- takes in both key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed

get:
- takes in the key and returns the value from the table

contains:
- takes in the key and returns a boolean, indicating if the key exists in the table already

hash:
- takes in an arbitrary key and returns an index in the collection
***

## Approach & Efficiency

Approach:
- The approach was to leverage the genius of those who went before me, analyze their solutions, and shamelessly rewrite them to my understanding and give them attribution.

Efficiency:
- A hash table with an effecient load factor will tend to have O(1) time for search, insert, and delete. Worst case is O(n) in a poorly factored hash table where frequent collisions require iteration over duplicate index values to find the key/value pair.

## API

hash method: Created the method using the algorithm in this doc: https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-30/resources/Hashtables.html

The steps are:

- Add all the ASCII values together.
- Multiply it by the prime number 599.
- Use modulo to get the remainder of the result, when divided by the total size of the array.
- Insert into the array at that index.

add method:
- Hash the key and add the key / value pair to the array bucket, handling collisions if necessary

get method:
- Get key from argument and return the value at the index hashed from that key from the table.

contains method:
-  takes in a key and returns a boolean. Boolean is true if the key exists in the table already. Otherwise....

hash method:
- takes in an arbitrary key and returns an index in the collection.