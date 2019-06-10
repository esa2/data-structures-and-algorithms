package stacksandqueues;

public class Stack {
    Node top;

    public void push(int value) {
        Node newNode = new Node(value);

        if (this.top == null) {
            this.top = newNode;
            newNode.next = null;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
    }
}
