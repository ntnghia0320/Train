package OPPExcercise02;

import java.util.ArrayList;

public class Stack {
    private final ArrayList<Integer> elements = new ArrayList<>();

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void push(int element) {
        elements.add(element);
    }

    public int pop() {
        if (!elements.isEmpty()) {
            int result = elements.get(elements.size() - 1);
            elements.remove(elements.size() - 1);
            return result;
        }
        throw new RuntimeException("Stack Underflow");
    }

    public int peek() {
        if (!elements.isEmpty()) {
            return elements.get(elements.size() - 1);
        }
        throw new RuntimeException("Stack Underflow");
    }
}