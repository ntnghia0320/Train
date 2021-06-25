package OPPExercise05;

import java.util.ArrayList;

public class Queue<T> {
    private final ArrayList<T> elements = new ArrayList<>();

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void enqueue(T item) {
        elements.add(item);
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");
        return this.elements.get(0);
    }

    public T dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");

        T item = elements.get(0);
        elements.remove(0);
        return item;
    }
}
