package io.coby.data.structures;

/**
 * Created by kalizsolt on 31/01/16.
 */
public class StackBasedOnArray {
    private int top = -1;
    private int[] stack = new int[10];

    public int top() {
        if (top == -1) {
            return -1;
        }
        return stack[top];
    }

    public void pop() {
        top--;
    }

    public void push(int i) {
        top++;
        stack[top] = i;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
