package edu.kis.vh.nursery;

/**
 * HanoiRhymer class extends DefaultCountingOutRhymer and represents a rhymer
 * with additional functionality to track rejected items.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /** Total number of rejected items. */
    private int totalRejected = 0;

    /**
     * Reports the total number of rejected items.
     *
     * @return the total number of rejected items
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Counts in a number to the rhymer. If the rhymer is not empty and the
     * given number is greater than the top item, it increments the total rejected count.
     * Otherwise, it calls the super method to count in the number.
     *
     * @param in the number to be counted in
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /**
     * Gets the total number of rejected items.
     *
     * @return the total number of rejected items
     */
    public int getTotalRejected() {
        return totalRejected;
    }
}
