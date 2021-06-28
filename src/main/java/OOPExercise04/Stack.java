package OOPExercise04;

import java.util.ArrayList;

public class Stack<T> {
    private void ensureNotEmpty() {
        if (isEmpty()) throw new RuntimeException("Stack Empty");
    }

    private final ArrayList<T> elements = new ArrayList<>();

    private int top = -1;

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(T element) {
        this.elements.add(++top, element);
    }

    public T peek() {
        ensureNotEmpty();

        return elements.get(top);
    }

    public T pop() {
        ensureNotEmpty();
        return elements.get(top--);

    }
}
