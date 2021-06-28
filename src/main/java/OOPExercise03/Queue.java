package OOPExercise03;

import java.util.ArrayList;

public class Queue {
    private void ensureNotEmpty() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");
    }

    private final ArrayList<Integer> elements = new ArrayList<>();

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void enqueue(int item) {
        elements.add(item);
    }

    public int peek() {
        ensureNotEmpty();
        return this.elements.get(0);
    }

    public int dequeue() {
        ensureNotEmpty();

        int item = elements.get(0);
        elements.remove(0);
        return item;
    }
}
