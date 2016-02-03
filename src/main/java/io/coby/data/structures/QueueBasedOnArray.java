package io.coby.data.structures;

/**
 * Created by kalizsolt on 31/01/16.
 */
public class QueueBasedOnArray {
    int top = -1;
    int[] queue = new int[100];

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int i) {
        top++;
        queue[top] = i;
    }

    public int pop() {
        int result = queue[0];
        shift();
        return result;
    }

    private void shift() {
        for (int i = 0; i < queue.length - 1; i++) {
            queue[i] = queue[i + 1];
        }
    }
}
