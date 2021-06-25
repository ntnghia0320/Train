package OOPExercise03;

import java.util.ArrayList;

public class Queue {
    private final ArrayList<Integer> elements = new ArrayList<>();

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void enqueue(int item) {
        elements.add(item);
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");
        return this.elements.get(0);
    }

    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");

        int item = elements.get(0);
        elements.remove(0);
        return item;
    }
}
