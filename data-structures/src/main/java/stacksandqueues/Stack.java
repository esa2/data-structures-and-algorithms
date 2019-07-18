//package stacksandqueues;
//
//public class Stack {
//    Node top;
//
//    public void push(int value) {
//        Node newNode = new Node(value);
//
//        if (this.top == null) {
//            this.top = newNode;
//            newNode.next = null;
//        } else {
//            newNode.next = this.top;
//            this.top = newNode;
//        }
//    }
//
//    public int pop() {
//
//        int topValue = this.top.value;
//
//        if (this.top.next == null) {
//            this.top = null;
//        } else {
//            this.top = this.top.next;
//        }
//        return topValue;
//    }
//
//    public int peek() {
//        return this.top.value;
//    }
//}
