package fifoAnimalShelter;

public class AnimalShelter<T> {
    Node<T> front;
    Node<T> back;

    public void enqueue(T animal) {
        Node<T> newNode = new Node<T>(animal);

        System.out.println("ruuuunnning");

        if (this.front == null) {
            this.front = newNode;
            this.back = newNode;

        } else {
            this.back.next = newNode;
            this.back = newNode;
        }
    }

    public T dequeue(T pref) {

        if (this.front == null) return null;

        Node<T> temp = this.front;
        this.front = this.front.next;
        return temp.data;
    }
}
