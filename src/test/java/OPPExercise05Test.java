import java.util.ArrayList;

public class OPPExercise05Test<T> {
    private final ArrayList<T> elements = new ArrayList<>();
    private int size = 0;
    private int front = 0;
    private int rear = -1;

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void enqueue(T item) {
        elements.add(++rear, item);
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");
        return this.elements.get(front);
    }

    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");

        int item = elements[front];
        front = (front + 1) % 1000;
        size--;
        return item;
    }
}
