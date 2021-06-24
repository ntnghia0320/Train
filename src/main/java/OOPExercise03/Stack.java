package OOPExercise03;

public class Stack {
    int top;
    int[] a = new int[1000];

    public Stack() {
        top = -1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public boolean push(int x) {
        if (top >= (1000 - 1)) {
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            return 0;
        } else {
            return a[top--];
        }
    }

    public int peek() {
        if (top < 0) {
            return 0;
        } else {
            return a[top];
        }
    }
}
