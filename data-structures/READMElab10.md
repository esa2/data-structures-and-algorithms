***Lab 10 Stack and Queue Implementation***

**Node Class:**
Create a Node class that has properties for the value stored in the Node and a pointer to the next Node.
***

**Stack Class:**
Create a Stack class that has a top property. It creates an empty Stack when instantiated.

push method

- Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.

pop method

- Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.

peek method

- Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
***

**Queue Class:**
Create a Queue class that has a top property. It creates an empty Queue when instantiated.

enqueue method

- Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.

dequeue method

- Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.

peek method

- Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.

[See the Node Class for lab 10](src/main/java/stacksandqueues/Node.java)

[See the Stack Class for lab 10](src/main/java/stacksandqueues/Stack.java)

[See the Queue Class for lab 10](src/main/java/stacksandqueues/Queue.java)

[See the tests for Stack class lab 10](src/test/java/stacksandqueues/StackTest.java)

[See the tests for Queue class lab 10](src/test/java/stacksandqueues/StackQueue.java)
