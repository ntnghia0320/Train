package OPPExcercise02;

public class Stack {
    private final int[] elements = new int[1000];
    private int top = -1;

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(int element) {
            elements[++top] = element;
    }

    public int pop() {
        if (top >= 0) {
            return elements[top--];
        }
        throw new RuntimeException("Stack Underflow");
    }

    public int peek() {
        if (top >= 0) {
            return elements[top];
        }
        throw new RuntimeException("Stack Underflow");
    }
}