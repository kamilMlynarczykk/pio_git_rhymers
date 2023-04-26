package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final Node LIST_EMPTY = null;
    private static final boolean LIST_NOT_FULL = false;
    private static final int LIST_NULL = -1;
    private Node last;


    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == LIST_EMPTY;
    }

    public boolean isFull() {
        return LIST_NOT_FULL;
    }

    public int top() {
        if (isEmpty())
            return LIST_NULL;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return LIST_NULL;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
