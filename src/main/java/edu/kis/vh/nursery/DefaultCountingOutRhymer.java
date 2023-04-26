package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_EMPTY = -1;
    public static final int NUMBERS_QUANTITY = 12;
    public static final int NUMBERS_FULL = NUMBERS_QUANTITY - 1;
    private int[] numbers = new int[NUMBERS_QUANTITY];

    public int total = NUMBERS_EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NUMBERS_EMPTY;
    }


    public boolean isFull() {
        return total == NUMBERS_FULL;
    }


    protected int peekaboo() {
        if (callCheck())
            return NUMBERS_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NUMBERS_EMPTY;
        return numbers[total--];
    }

}
