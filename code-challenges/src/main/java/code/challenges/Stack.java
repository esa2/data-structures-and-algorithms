package code.challenges;

public class Stack {
    Node top;

    public void push(String value) {
        Node newNode = new Node(value);

        if (this.top == null) {
            this.top = newNode;
            newNode.next = null;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
    }

    public String pop() {

        String topValue = this.top.value;

        if (this.top.next == null) {
            this.top = null;
        } else {
            this.top = this.top.next;
        }
        return topValue;
    }

    public String peek() {
        return this.top.value;
    }
}
