

/**
 * Checks if given <code>value</code> is a power of two.
 *
 * @param value any number
 * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
 */
public static boolean isPowerOfTwo(int value) {
    int x = Math.abs(value);
    return (x != 0) && ((x & (x-1)) == 0);
}