package fifoAnimalShelter;

public class AnimalShelter<T> {
    Node<T> dogFront;
    Node<T> dogBack;
    Node<T> catFront;
    Node<T> catBack;

    public void enqueue(T animal) {

        if (animal.getClass() == Dog.class) {
            enqueuDog(animal);
        }
        if (animal.getClass() == Cat.class) {
            enqueuCat(animal);
        }
    }

    public void enqueuDog(T animal) {
        Node<T> newNode = new Node<T>(animal);

        if (this.dogFront == null) {
            this.dogFront = newNode;
            this.dogBack = newNode;

        } else {
            this.dogBack.next = newNode;
            this.dogBack = newNode;
        }
    }

    public void enqueuCat(T animal) {
        Node<T> newNode = new Node<T>(animal);

        if (this.catFront == null) {
            this.catFront = newNode;
            this.catBack = newNode;

        } else {
            this.catBack.next = newNode;
            this.catBack = newNode;
        }
    }

    public T dequeue(T pref) {

        if (pref != "dog" && pref != "cat") return null;

        if (pref == "dog") {
            if (this.dogFront == null) return null;
            Node<T> temp = this.dogFront;
            this.dogFront = this.dogFront.next;
            return temp.data;
        } else {
            if (this.catFront == null) return null;
            Node<T> temp = this.catFront;
            this.catFront = this.catFront.next;
            return temp.data;
        }
    }
}
