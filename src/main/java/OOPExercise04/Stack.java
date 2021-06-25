package OOPExercise04;

import java.util.ArrayList;

public class Stack<T> {
    private final ArrayList<T> elements = new ArrayList<>();

    private int top = -1;

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(T element) {
        this.elements.add(++top, element);
    }

    public T peek() {
        if (top >= 0) {
            return elements.get(top);
        }
        throw new RuntimeException("Stack Underflow");
    }

    public T pop() {
        if (top >= 0) {
            return elements.get(top--);
        }
        throw new RuntimeException("Stack Underflow");
    }
}
