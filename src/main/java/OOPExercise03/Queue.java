package OOPExercise03;

public class Queue {
    private final int[] elements = new int[1000];
    private int size = 0;
    private int front = 0;
    private int rear = 999;

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int item) {
        rear = (rear + 1) % 1000;
        elements[rear] = item;
        size++;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");
        return this.elements[front];
    }

    public int poll() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");

        int item = elements[front];
        front = (front + 1) % 1000;
        size--;
        return item;
    }
}
