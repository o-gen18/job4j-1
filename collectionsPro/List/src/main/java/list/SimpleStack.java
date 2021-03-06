package list;

import list.LinkedListBasedContainer;

public class SimpleStack<T> {
    private LinkedListBasedContainer<T> contentOfStack;

    public SimpleStack() {
        contentOfStack = new LinkedListBasedContainer<>();
    }

    public T poll() {
        return contentOfStack.removeLast();
    }

    public void push(T value) {
        contentOfStack.add(value);
    }

    public boolean isEmpty() {
        return contentOfStack.isEmpty();
    }
}
