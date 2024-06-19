package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int INITIAL_VALUE = -1;
    private static final int ERROR = -1;
    private static final int FULL = CAPACITY - 1;

    private final int[] numbers = new int[CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = INITIAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL_VALUE;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
