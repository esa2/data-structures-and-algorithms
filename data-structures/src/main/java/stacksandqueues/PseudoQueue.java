package stacksandqueues;

public class PseudoQueue {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public void enqueue(int value) {

        stack1.push(20);
        stack1.push(15);
        stack1.push(10);

        stack1.push(value);

        while (stack1.top != null)
            stack2.push(stack1.pop());
    }
}
