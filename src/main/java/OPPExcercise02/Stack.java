package OPPExcercise02;

import java.util.ArrayList;

public class Stack {
    private void ensureNotEmpty() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");
    }

    private final ArrayList<Integer> elements = new ArrayList<>();

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void push(int element) {
        elements.add(element);
    }

    public int pop() {
        ensureNotEmpty();

        int result = elements.get(elements.size() - 1);
        elements.remove(elements.size() - 1);
        return result;
    }

    public int peek() {
        ensureNotEmpty();
        return elements.get(elements.size() - 1);
    }
}