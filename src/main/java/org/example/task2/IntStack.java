package org.example.task2;

import java.util.Arrays;

public class IntStack {


    private int[] elements;

    private int size;

    private static final int INITIAL_CAPACITY = 10;


    public IntStack() {
        this.elements = new int[INITIAL_CAPACITY];
        this.size = 0;
    }


    public void push(int value) {
        ensureCapacity();
        this.elements[size] = value;
        size++;
    }


    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = this.elements[size - 1];
        this.elements[size - 1] = 0; // очищаємо старе значення
        size--;
        return value;
    }


    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.elements[size - 1];
    }


    public int size() {
        return this.size;
    }

    // Перевіряє, чи стек порожній
    public boolean isEmpty() {
        return this.size == 0;
    }


    public void clear() {
        Arrays.fill(this.elements, 0);
        this.size = 0;
    }


    private void ensureCapacity() {
        if (size >= elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntStack: [");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}