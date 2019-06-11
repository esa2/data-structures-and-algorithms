package stacksandqueues;

public class PseudoQueue {

    Stack stack1 = new Stack();
    Stack queue = new Stack();

    public void enqueue(int value) {

        stack1.push(value);

        while (stack1.top != null)
            queue.push(stack1.pop());
    }

    public void dequeue() {

            queue.pop();
    }
}
