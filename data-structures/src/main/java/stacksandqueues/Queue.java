package stacksandqueues;

public class Queue {
    Node front;

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (this.front == null) {
            this.front = newNode;
            newNode.next = null;
        } else {
            this.front.next = newNode;
        }
    }

    public int dequeue() {
        int frontValue = this.front.value;

        if (this.front.next == null) {
            this.front = null;
        } else {

            this.front = this.front.next;
        }
        return frontValue;
    }

    public int peek() {
        return this.front.value;
    }
}
